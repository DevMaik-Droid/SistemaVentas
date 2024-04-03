package com.dev_team.controllers;

import com.dev_team.models.Categoria;
import com.dev_team.models.Producto;
import com.dev_team.models.Proveedor;
import com.dev_team.services.Conexion;
import com.dev_team.services.Service_Categoria;
import com.dev_team.services.Service_Producto;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.vistas.InterGestionarProducto;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CtrlGestionarProducto extends InterGestionarProducto implements ActionListener {

    private Long idProducto;
    Long obtenerIdCategoriaCombo = 0L;

    public CtrlGestionarProducto() {
        btn_actualizar.addActionListener(this);
        btn_eliminar.addActionListener(this);
        CargarTablaProductos();
        CargarCbxCategoria();
        CargarCbxProveedor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btn_actualizar == e.getSource()) {
            actualizar();
        } else if (btn_eliminar == e.getSource()) {
            eliminar();
        }
    }

    private void actualizar() {
        Producto producto = new Producto();
        Service_Producto controlProducto = new Service_Producto();
        String iva = "";
        String categoria = "";
        iva = jComboBox_iva.getSelectedItem().toString().trim();
        categoria = cbx_categoria.getSelectedItem().toString().trim();

        //validar campos
        if (txt_nombre.getText().isEmpty() || txt_cantidad.getText().isEmpty() || txt_precio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            if (iva.equalsIgnoreCase("Seleccione iva:")) {
                JOptionPane.showMessageDialog(null, "Seleccione iva.");
            } else {
                if (categoria.equalsIgnoreCase("Seleccione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Seleccione categoria");
                } else {
                    try {
                        producto.setNombre(txt_nombre.getText().trim());
                        producto.setCantidad(Integer.parseInt(txt_cantidad.getText().trim()));
                        String precioTXT = "";
                        double Precio = 0.0;
                        precioTXT = txt_precio.getText().trim();
                        boolean aux = false;
                        /*
                            *Si el usuario ingresa , (coma) como punto decimal,
                            lo transformamos a punto (.)
                         */
                        for (int i = 0; i < precioTXT.length(); i++) {
                            if (precioTXT.charAt(i) == ',') {
                                String precioNuevo = precioTXT.replace(",", ".");
                                Precio = Double.parseDouble(precioNuevo);
                                aux = true;
                            }
                        }
                        //evaluar la condicion
                        if (aux == true) {
                            producto.setPrecio(Precio);
                        } else {
                            Precio = Double.parseDouble(precioTXT);
                            producto.setPrecio(Precio);
                        }
                        //Porcentaje IVA
                        if (iva.equalsIgnoreCase("No grava iva")) {
                            producto.setPorcentajeIva(0);
                        } else if (iva.equalsIgnoreCase("13%")) {
                            producto.setPorcentajeIva(13);
                        }

                        //idcategoria - cargar metodo que obtiene el id de categoria
                        this.IdCategoria();
                        producto.setIdCategoria(obtenerIdCategoriaCombo);
                        producto.setEstado(1);

                        if (controlProducto.actualizar(producto, idProducto)) {
                            JOptionPane.showMessageDialog(null, "Registro Actualizado");
                            this.CargarTablaProductos();
                            this.jComboBox_iva.setSelectedItem("Seleccione iva:");
                            this.Limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar");
                        }
                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Error en: " + e);
                    }
                }
            }
        }

    }

    private void eliminar() {
        Service_Producto controlProducto = new Service_Producto();
        if (idProducto == 0) {
            JOptionPane.showMessageDialog(null, "¡Seleccione un Producto!");
        } else {
            if (!controlProducto.eliminar(idProducto)) {
                JOptionPane.showMessageDialog(null, "¡Producto Eliminado!");
                this.CargarTablaProductos();
                this.Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "¡Error al eliminar producto!");
            }
        }
    }

    /*
     * *****************************************************
     * metodo para limpiar
     * *****************************************************
     */
    private void Limpiar() {
        txt_nombre.setText("");
        txt_cantidad.setText("");
        txt_precio.setText("");
        jComboBox_iva.setSelectedItem("Seleccione iva:");
        cbx_categoria.setSelectedItem("Seleccione categoria:");
    }

    /*
     * *****************************************************
     * metodo para cargar las categorias en el JCombox
     * *****************************************************
     */
    private void CargarCbxCategoria() {
        Service_Categoria sct = new Service_Categoria();
        List<Categoria> lista = (List<Categoria>) sct.listar();
        cbx_categoria.addItem(new Categoria(0L, "Seleccione categoria"));
        lista.forEach(categoria -> {
            cbx_categoria.addItem(categoria);
        });
    }
    
    private void CargarCbxProveedor() {
        Service_Proveedor spr = new Service_Proveedor();
        List<Proveedor> lista = (List<Proveedor>) spr.listar();
        cbx_proveedor.addItem(new Proveedor(0L, "Seleccione proveedor"));
        lista.forEach(proveedor -> {
            cbx_proveedor.addItem(proveedor);
        });
    }
    /*
     * *****************************************************
     * metodo para mostrar todos los productos registrados
     * *****************************************************
     */
    String descripcionCategoria = "";
    double precio = 0.0;
    int porcentajeIva = 0;
    double IVA = 0;

    private void CargarTablaProductos() {
        Connection con = Conexion.conectar();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select p.idProducto,p.producto,p.cantidad,p.precio,pp.nombre,p.porcentajeIva,c.categoria,p.estado from tb_producto p,tb_categoria c ,tb_proveedor pp \n"
                + "WHERE p.idCategoria = c.idCategoria and p.idProveedor = pp.idProveedor;";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarProducto.jTable_productos = new JTable(model);
            InterGestionarProducto.jScrollPane1.setViewportView(InterGestionarProducto.jTable_productos);

            model.addColumn("N°");//ID
            model.addColumn("producto");
            model.addColumn("cantidad");
            model.addColumn("precio");
            model.addColumn("proveedor");
            model.addColumn("Iva");
            model.addColumn("Categoria");
            model.addColumn("estado");

            while (rs.next()) {

                precio = rs.getDouble("precio");
                porcentajeIva = rs.getInt("porcentajeIva");

                Object fila[] = new Object[8];
                for (int i = 0; i < 8; i++) {

                    if (i == 5) {
                        this.calcularIva(precio, porcentajeIva);//metodo
                        fila[i] = IVA;
                        rs.getObject(i + 1);
                    } else {
                        fila[i] = rs.getObject(i + 1);
                    }
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla productos: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_productos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila = jTable_productos.rowAtPoint(e.getPoint());
                int columna = 0;

                if (fila > -1) {
                    idProducto = (Long) model.getValueAt(fila, columna);
                    EnviarDatosProductoSeleccionado(idProducto);//metodo
                }
            }
        });
    }

    /*
     * **************************************************
     * Metodo para calcular Iva
     * **************************************************
     */
    private double calcularIva(double precio, int iva) {
        int p_iva = iva;
        switch (p_iva) {
            case 0:
                IVA = 0.0;
                break;
            case 13:
                IVA = precio * 0.13;
                break;
            default:
                break;
        }
        //redondear decimales
        IVA = (double) Math.round(IVA * 100) / 100;
        return IVA;
    }

    /*
     * **************************************************
     * Metodo que envia datos seleccionados
     * **************************************************
     */
    private void EnviarDatosProductoSeleccionado(Long idProducto) {
        try {
            Connection con = Conexion.conectar();
            Proveedor proveedor = new Proveedor();
            Categoria categoria = new Categoria();
            String sql = "SELECT p.idProducto,p.producto,p.cantidad,p.precio,pp.idProveedor,pp.nombre,p.porcentajeIva, c.idCategoria, c.categoria, p.pro_imagen\n" +
                        "FROM tb_producto p\n" +
                        "JOIN tb_proveedor pp ON p.idProveedor = pp.idProveedor \n" +
                        "JOIN tb_categoria c ON p.idCategoria = c.idCategoria\n" +
                        "WHERE p.idProducto = " + idProducto;
            
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("producto"));
                txt_cantidad.setText(rs.getString("cantidad"));
                txt_precio.setText(rs.getString("precio"));
                proveedor.setIdProveedor(rs.getLong("idProveedor"));
                proveedor.setNombre(rs.getString("nombre"));
                
                System.out.println(proveedor.getNombre());
                cbx_proveedor.setSelectedItem(proveedor);
                
                
                int iva = rs.getInt("porcentajeIva");
               
                switch (iva) {
                    case 0:
                        jComboBox_iva.setSelectedItem("No grava iva");
                        break;
                    case 13:
                        jComboBox_iva.setSelectedItem("13%");
                        break;
                    default:
                        jComboBox_iva.setSelectedItem("Seleccione iva:");
                        break;
                }
                categoria.setIdCategoria(rs.getLong("idCategoria"));
                categoria.setDescripcion(rs.getString("categoria"));
                cbx_categoria.setSelectedItem(categoria);
                
                byte [] imagenbyte = rs.getBytes("pro_imagen");
                ImageIcon imagen =  new ImageIcon(imagenbyte);
                Image img = imagen.getImage().getScaledInstance(lb_imagen.getWidth(),lb_imagen.getHeight(),Image.SCALE_DEFAULT);
                lb_imagen.setIcon(new ImageIcon(img));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar producto: " + e);
        }
    }


    /**
     *
     * Metodo para obtener id categoria
     */
    private Long IdCategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.cbx_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerIdCategoriaCombo = rs.getLong("idCategoria");
            }
        } catch (SQLException e) {
            System.out.println("Error al obener id categoria");
        }
        return obtenerIdCategoriaCombo;
    }

}
