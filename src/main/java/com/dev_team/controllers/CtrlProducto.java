package com.dev_team.controllers;

import com.dev_team.models.Categoria;
import com.dev_team.models.Producto;
import com.dev_team.models.Proveedor;
import com.dev_team.services.Conexion;
import com.dev_team.services.Service_Categoria;
import com.dev_team.services.Service_Producto;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.vistas.InterProducto;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CtrlProducto extends InterProducto implements ActionListener {

    int obtenerIdCategoriaCombo = 0;
    FileInputStream input_image;

    public CtrlProducto() {
        CargarCbxProveedor();
        CargarCbxCategoria();
        btn_buscarImg.addActionListener(this);
        btn_Guardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btn_Guardar == e.getSource()) {
            guardarProducto();
        } else if (btn_buscarImg == e.getSource()) {
            buscarImagen();
        }
    }

    private void guardarProducto() {
        Producto producto = new Producto();
        Proveedor proveedor = (Proveedor) cbx_proveedor.getSelectedItem();
        Categoria categoria = (Categoria) cbx_categorias.getSelectedItem();

        producto.setNombre(txt_nombre.getText().trim());
        producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
        producto.setPrecio(Integer.parseInt(txt_precio.getText().trim()));
        producto.setDescripcion(txt_descripcion.getText().trim());
        if (cbx_iva.getSelectedItem().equals("13%")) {
            producto.setPorcentajeIva(13);
        }
        producto.setIdProveedor(proveedor.getIdProveedor());
        producto.setIdCategoria(categoria.getIdCategoria());
        producto.setImagen(input_image);

        Service_Producto service = new Service_Producto();
        if (service.crear(producto)) {
            JOptionPane.showMessageDialog(null, "Producto creado!");
            this.Limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Error al crear producto!");
        }

    }

    /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        txt_descripcion.setText("");
    }

    /**
     *
     * Metodo para obtener id categoria
     */
    private int IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.cbx_categorias.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getInt("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

    private void CargarCbxProveedor() {
        Service_Proveedor spr = new Service_Proveedor();
        List<Proveedor> lista = (List<Proveedor>) spr.listar();
        cbx_proveedor.addItem(new Proveedor(0L, "Seleccione proveedor"));
        for (Proveedor proveedor : lista) {
            cbx_proveedor.addItem(proveedor);
        }
    }

    private void CargarCbxCategoria() {
        Service_Categoria sct = new Service_Categoria();
        List<Categoria> lista = (List<Categoria>) sct.listar();
        cbx_categorias.addItem(new Categoria(0L, "Seleccione categoria"));
        for (Categoria categoria : lista) {
            cbx_categorias.addItem(categoria);
        }
    }

    private void buscarImagen() {
        File archivo = null;
        try {

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Imagenes", "jpg", "png");
            chooser.setFileFilter(filter);
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                archivo = chooser.getSelectedFile();
                tf_url.setText(archivo.getName());
            }

            Image img = ImageIO.read(archivo).getScaledInstance(lb_imagen.getWidth(), lb_imagen.getHeight(), Image.SCALE_DEFAULT);
            ImageIcon icon = new ImageIcon(img);

            lb_imagen.setIcon(icon);

            input_image = new FileInputStream(archivo);
        } catch (IOException | IllegalArgumentException ex) {
            System.out.println("No se seleciono la imagen");
        }
    }
}
