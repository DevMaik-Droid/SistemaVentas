/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.controllers;

import com.dev_team.dashboard.Vista_Dashboard;
import com.dev_team.models.Cliente;
import com.dev_team.models.Producto;
import com.dev_team.models.Venta;
import com.dev_team.services.Service_Cliente;
import com.dev_team.services.Service_Producto;
import com.dev_team.utilidades.MultilineaCellRenderer;
import com.dev_team.utilidades.Table_Cell_Render;
import com.dev_team.utilidades.Table_Header_Render;
import com.dev_team.views.V_Ventas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Objects;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import org.jdesktop.swingx.JXList;

public class VentasController extends V_Ventas {

    private DefaultListModel<Cliente> model_list;
    private List<Cliente> lista_clientes;
    private JXList list;
    private List<Producto> lista_productos;

    public VentasController() {
        lista_clientes = (List<Cliente>) new Service_Cliente().listar();
        Service_Producto svc_producto = new Service_Producto();
        lista_productos = (List<Producto>) svc_producto.listar();
        
        
        generarLista();
        generarTablaProductos();
        sh_buscarCliente.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filtrarLista(sh_buscarCliente.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filtrarLista(sh_buscarCliente.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }

        });

        list.addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                Cliente cliente = (Cliente) list.getSelectedValue();
                if (cliente != null) {
                    actualizarCampos(cliente);
                }
            }
        });
        tb_productos.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int fila = tb_productos.rowAtPoint(e.getPoint());
                int columna = 0;
                
                Long idProducto = Long.valueOf(tb_productos.getValueAt(fila, columna).toString());
                Producto p = lista_productos.stream().filter(x -> Objects.equals(x.getIdProducto(), idProducto)).findFirst().orElse(null);
                tf_precio.setText(p.getPrecioUnitario()+"");
                tf_id_producto.setText(p.getIdProducto()+"");
                
            }

        });

        btn_vender.addActionListener(x-> {
            registrarVenta();
        });
        this.repaint();
    }

    private void actualizarCampos(Cliente c) {
        tf_nombre.setText(c.getNombre());
        tf_apellido.setText(c.getApellido());
        tf_email.setText(c.getEmail());
        tf_telefono.setText(c.getTelefono());
    }

    private void generarLista() {
        model_list = new DefaultListModel<>();
        lista_clientes.forEach(model_list::addElement);
        list = new JXList(model_list);
        list.setForeground(Color.BLUE);
        list.setBackground(Color.red);
        list.setSelectionForeground(Color.lightGray);
        list.setSelectionBackground(Color.lightGray);
        list.setFont(new Font("Arial",Font.PLAIN,16));
        panel_cliente.add(new JScrollPane(list));
    }

    private void filtrarLista(String entrada) {
        model_list.clear();
        lista_clientes.stream().filter(x -> x.getNombre().toUpperCase().contains(entrada.toUpperCase())).forEach(model_list::addElement);

    }

    private void generarTablaProductos() {

        
        Object[] columas = {"ID PRODUCTO", "NOMBRE", "CATEGORIA", "PRECIO", "STOCK", "DETALLE"};
        DefaultTableModel model = new DefaultTableModel(columas, 0);

        for (Producto p : lista_productos) {
            Object[] datos = new Object[columas.length];
            datos[0] = p.getIdProducto();
            datos[1] = p.getNombreProducto();
            datos[2] = p.getCategoriaProducto();
            datos[3] = p.getPrecioUnitario();
            datos[4] = p.getStock();
            datos[5] = p.getDetalle();
            model.addRow(datos);
        }

        tb_productos.setModel(model);

        TableColumnModel columnModel = tb_productos.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(60);
        columnModel.getColumn(4).setPreferredWidth(60);
        columnModel.getColumn(5).setPreferredWidth(150);

        tb_productos.setRowHeight(60);
        tb_productos.getTableHeader().setDefaultRenderer(new Table_Header_Render());
        tb_productos.setDefaultRenderer(Object.class, new Table_Cell_Render()); // Personalizar celdas
        tb_productos.setDefaultEditor(Object.class, null);
        // Asignar el MultiLineCellRenderer a la columna "DETALLE"
        columnModel.getColumn(5).setCellRenderer(new MultilineaCellRenderer());

    }

    private void registrarVenta() {

        Cliente cliente = lista_clientes.stream()
                .filter(x -> x.getNombre().equals(tf_nombre.getText()) && x.getApellido().equals(tf_apellido.getText()))
                .findFirst().orElse(null);
        
        System.out.println(cliente.getIdCliente());
        Long l = Vista_Dashboard.idUsuario;
        System.out.println("Id_usuario" + l);
        
        Venta venta = new Venta();
        
        
       

    }
}
