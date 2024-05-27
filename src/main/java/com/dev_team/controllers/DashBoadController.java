package com.dev_team.controllers;

import com.dev_team.models.Producto;
import com.dev_team.services.Service_Producto;
import com.dev_team.utilidades.Table_Cell_Render;
import com.dev_team.utilidades.Table_Header_Render;
import com.dev_team.views.V_Dashboard;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class DashBoadController extends V_Dashboard{

    public DashBoadController() {
        
        
        cbx_opciones.addActionListener(x -> {
            String op = cbx_opciones.getSelectedItem().toString();
            generarTabla(op);
        });
        
    }
  
    private void generarTabla(String s){
        switch (s) {
            case "PRODUCTOS" -> generarTablaProductos();
            case "Clientes" -> generarTablaProductos();
            case "Ventas" -> generarTablaProductos();
            
        }
        
        
    }

    private void generarTablaProductos() {
        
        List<Producto> productos = (List<Producto>) new Service_Producto().listar();
        
        Object[] columas = {"CLAVE", "NOMBRE", "CATEGORIA", "PRECIO", "STOCK", "DETALLE", "ESTADO"};
        DefaultTableModel model = new DefaultTableModel(columas, 0);

        for (Producto p : productos) {
            Object[] datos = new Object[columas.length];
            
            datos[0] = p.getClaveProducto();
            datos[1] = p.getNombreProducto();
            datos[2] = p.getCategoriaProducto();
            datos[3] = p.getPrecioUnitario();
            datos[4] = p.getStock();
            datos[5] = p.getDetalle();
            datos[6] = p.getDisponibilidad();
            model.addRow(datos);
        }
        
        tb_dashboard.setModel(model);
        
        TableColumnModel columnModel = tb_dashboard.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(50);
        columnModel.getColumn(1).setPreferredWidth(120);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(110);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(70);
        
        tb_dashboard.setRowHeight(30);
        tb_dashboard.getTableHeader().setDefaultRenderer(new Table_Header_Render());
        tb_dashboard.setDefaultRenderer(Object.class, new Table_Cell_Render()); // Personalizar celdas
        tb_dashboard.setDefaultEditor(Object.class, null);
        
        
    }
    
    
    
}
