/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.controllers;

import com.dev_team.models.Cliente;
import com.dev_team.models.Producto;
import com.dev_team.services.Service_Cliente;
import com.dev_team.services.Service_Producto;
import com.dev_team.utilidades.MultilineaCellRenderer;
import com.dev_team.utilidades.Table_Cell_Render;
import com.dev_team.utilidades.Table_Header_Render;
import com.dev_team.views.V_Ventas;
import java.util.List;
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
    private final List<Cliente> lista_clientes;
    private JXList list;
    private final List<Producto> lista_productos;

    public VentasController() {
        lista_clientes = (List<Cliente>) new Service_Cliente().listar();
        lista_productos = (List<Producto>) new Service_Producto().listar();

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
        panel_cliente.add(new JScrollPane(list));
    }

    private void filtrarLista(String entrada) {
        model_list.clear();
        lista_clientes.stream().filter(x -> x.getNombre().toUpperCase().contains(entrada.toUpperCase())).forEach(model_list::addElement);

    }

    private void generarTablaProductos() {

        List<Producto> productos = (List<Producto>) new Service_Producto().listar();

        Object[] columas = {"CLAVE", "NOMBRE", "CATEGORIA", "PRECIO", "STOCK", "DETALLE"};
        DefaultTableModel model = new DefaultTableModel(columas, 0);

        for (Producto p : productos) {
            Object[] datos = new Object[columas.length];

            datos[0] = p.getClaveProducto();
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

}
