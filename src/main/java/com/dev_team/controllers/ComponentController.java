package com.dev_team.controllers;

import com.dev_team.models.Componente;
import com.dev_team.models.Proveedor;
import com.dev_team.services.Service_Componente;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.utilidades.Main_Colores;
import com.dev_team.views.V_RegistrarComponentes;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ComponentController extends V_RegistrarComponentes {

    private static final String[] CAPACIDADES_RAM = {"8 GB", "16 GB", "32 GB", "64 GB"};
    private static final String[] CAPACIDADES_HDD_SSD = {"250 GB", "500 GB", "1 TB", "2 TB", "4 TB"};

    private static final String[] VELOCIDADES_RAM = {
        "DDR5-6400 MHz", "DDR5-5600 MHz", "DDR5-5200 MHz", "DDR5-4800 MHz",
        "DDR4-4800 MHz", "DDR4-4600 MHz", "DDR4-4266 MHz", "DDR4-4000 MHz", "DDR4-3600 MHz",
        "DDR4-3200 MHz", "DDR4-2933 MHz", "DDR4-2666 MHz", "DDR4-2400 MHz", "DDR4-2133 MHz",
        "DDR3-3000 MHz", "DDR3-2666 MHz", "DDR3-2400 MHz", "DDR3-2133 MHz", "DDR3-1866 MHz",
        "DDR3-1600 MHz", "DDR3-1333 MHz", "DDR3-1066 MHz", "DDR3-800 MHz"
    };

    private static final String[] VELOCIDADES_HDD = {"5400 RPM", "7200 RPM"};

    private static final String[] VELOCIDADES_SSD = {
        "SATA SSD - 500 MB/s a 600 MB/s",
        "SATA SSD - 300 MB/s a 400 MB/s",
        "NVMe M.2 - NVMe PCIe Gen3 x4",
        "NVMe M.2 - NVMe PCIe Gen4 x4"
    };

    private InputStream input_image;

    public ComponentController() {

        cargarCbxProveedor();

        btn_buscar.addActionListener(e -> {
            seleccionarImagen();
        });

        btn_registrar.addActionListener(e -> {
            registrarComponente();
        });

        cbx_componente.addActionListener(c -> {
            String componente = cbx_componente.getSelectedItem().toString();
            actualizarComponentes(componente);

        });

    }

    private void cargarCbxProveedor() {
        List<Proveedor> proveedor = (List<Proveedor>) new Service_Proveedor().listar();
        proveedor.stream()
                .filter(p -> p.getProductoSuministrado().equals("Componentes"))
                .forEach(x -> cbx_proveedor.addItem(x));
    }

    private void actualizarComponentes(String componente) {
        activarComponentes(componente.contains("RAM") || componente.contains("SDD") || componente.contains("HDD"));

        if (componente.contains("RAM")) {
            agregarItemsComboBox(CAPACIDADES_RAM, VELOCIDADES_RAM);
        } else if (componente.contains("HDD")) {
            agregarItemsComboBox(CAPACIDADES_HDD_SSD, VELOCIDADES_HDD);
        } else if (componente.contains("SDD")) {
            agregarItemsComboBox(CAPACIDADES_HDD_SSD, VELOCIDADES_SSD);
        } else {
            cbx_resolucion.removeAllItems();
            cbx_velocidad.removeAllItems();
        }
    }

    private void activarComponentes(boolean accion) {
        Color fondo = accion ? Color.WHITE : Main_Colores.C_200;
        cbx_resolucion.setBackground(fondo);
        cbx_velocidad.setBackground(fondo);
        cbx_resolucion.setEnabled(accion);
        cbx_velocidad.setEnabled(accion);
    }

    private void agregarItemsComboBox(String[] capacidades, String[] velocidades) {
        cbx_resolucion.removeAllItems();
        cbx_velocidad.removeAllItems();
        Arrays.stream(capacidades).forEach(cbx_resolucion::addItem);
        Arrays.stream(velocidades).forEach(cbx_velocidad::addItem);
    }

    private void registrarComponente() {

        Componente componente = new Componente();
        Service_Componente service = new Service_Componente();

        componente.setComponente(cbx_componente.getSelectedItem().toString());
        componente.setMarca(tf_marca.getText().trim().toUpperCase());
        componente.setModelo(tf_modelo.getText().trim().toUpperCase());
        String capacidad = "";
        String velocidad = "";
        if (cbx_resolucion.isEnabled()) {
            capacidad = cbx_resolucion.getSelectedItem().toString();
            velocidad = cbx_velocidad.getSelectedItem().toString();
        }

        componente.setCapacidad(capacidad);
        componente.setVelocidad(velocidad);
        Proveedor prov = (Proveedor) cbx_proveedor.getSelectedItem();
        componente.setIdProveedor(prov.getIdProveedor());
        componente.setPrecio(Double.valueOf(tf_precio.getText().trim()));
        componente.setCantidad(Integer.valueOf(tf_cantidad.getText().trim()));
        componente.setDisponibilidad("DISPONIBLE");
        componente.setImagen(input_image);
        componente.setDescripcion(ta_descripcion.getText().trim());
        
        if (service.crear(componente)) {
            mostrarMensaje("Componente Registrado");
            limpiar();
        } else {
            mostrarMensaje("Error en registrar componente");
        }

    }

    private void limpiar() {
        tf_marca.setText("");
        tf_cantidad.setText("");
        tf_modelo.setText("");
        tf_precio.setText("");
        lb_imagen.setIcon(null);
        cbx_componente.setSelectedIndex(0);
        cbx_resolucion.removeAllItems();
        cbx_velocidad.removeAllItems();
        ta_descripcion.setText("");
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);

    }

    private void seleccionarImagen() {
        File archivo = null;
        try {

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes", "jpg", "png");
            chooser.setFileFilter(filter);
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                archivo = chooser.getSelectedFile();
            }

            Image img = ImageIO.read(archivo).getScaledInstance(lb_imagen.getWidth(), lb_imagen.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(img);

            lb_imagen.setIcon(icon);

            input_image = new FileInputStream(archivo);
        } catch (IOException | IllegalArgumentException ex) {
            System.out.println("No se seleciono la imagen");
        }
    }

    /* private void cargarCbxMotherboard() {
        
        List<PlacaMadre> placas = service.listarPlacas();
        
        //Agregar Marcas al combo box
        Set<String> marcas = new HashSet<>();
        
        placas.forEach(p -> marcas.add(p.getMarca()));

        marcas.forEach(x -> cbx_marcaC.addItem(x));
        
        List<String> modelos = new ArrayList<>();
        
        cbx_marcaC.addActionListener(e -> {
            
            String marcaSelecionada = cbx_marcaC.getSelectedItem().toString();
            placas.stream()
                    .filter(placa -> placa.getMarca().equals(marcaSelecionada))
                    .forEach(x -> modelos.add(x.getModelo()));
            
            cargarCbxModelo(modelos.toArray());
            modelos.clear();
            
        });

    }

    private void cargarCbxModelo(Object[] modelos) {
        cbx_modeloC.removeAllItems();
       
        Arrays.stream(modelos).forEach(x -> cbx_modeloC.addItem(x.toString()));
    }*/
}
