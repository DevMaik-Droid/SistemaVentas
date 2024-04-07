/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.controllers;

import com.dev_team.models.Usuario;
import com.dev_team.services.Service_Usuario;
import com.dev_team.utilidades.Perzonalizar_Celdas;
import com.dev_team.views.D_AdmUsuario;
import com.dev_team.views.V_GestionarUsuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class GestionUsuarioController extends V_GestionarUsuario {

    Service_Usuario serv_usuario = new Service_Usuario();
    List<Usuario> lista_usuario;
    String opcion = "";
    
    public GestionUsuarioController() {
        
        lista_usuario = (List<Usuario>) serv_usuario.listar();
        GenerarTabla(lista_usuario);
        
        btn_buscaUS.addActionListener(ev ->{
            List<Usuario> lists = lista_usuario.stream().filter( us -> us.getClave().equals(tf_clave.getText())).collect(Collectors.toList());
            GenerarTabla(lists);
        });
        
        tf_filtrar.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                opcion = cbx_filtrarGU.getSelectedItem().toString();
                filtrarUsuarios(opcion, tf_filtrar.getText().trim());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                opcion = cbx_filtrarGU.getSelectedItem().toString();
                filtrarUsuarios(opcion, tf_filtrar.getText().trim());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        
        cbx_filtrarGU.addActionListener(e ->{
        
            filtrarUsuarios(cbx_filtrarGU.getSelectedItem().toString(), tf_filtrar.getText());
            
        });
        
        
        
    }

   // logica para filtrar usuarios
    public void filtrarUsuarios(String opcion,String cadena){
        List<Usuario> lists;
        switch (opcion) {
            case "Cedula de identidad" -> {
                lists = lista_usuario.stream()
                        .filter(us -> us.getCi().startsWith(cadena))
                        .collect(Collectors.toList());
                GenerarTabla(lists);
            }
            case "Apellido" -> {
                lists = lista_usuario.stream()
                        .filter(us -> us.getApellido().startsWith(cadena.toUpperCase()))
                        .collect(Collectors.toList());
                GenerarTabla(lists);
            }
            case "Nombre" -> {
                lists = lista_usuario.stream() 
                        .filter(us -> us.getNombre().startsWith(cadena.toUpperCase()))
                        .collect(Collectors.toList());
                GenerarTabla(lists);
            }
            default -> {
                GenerarTabla(lista_usuario);
            }
        }
 
    }
   

    public final void GenerarTabla(List<Usuario> lista_usuario) {
        Object[] columnas = {"Clave", "Apellido", "Nombre", "CI","Telefono", "Direccion", "Estado"};

       // DefaultTableModel model = new DefaultTableModel(columnas, 0);
        tabla_usuarios.setColumnas(columnas);
        
        /*for (Usuario us : lista_usuario) {
            Object[] elementos = new Object[columnas.length];

            elementos[0] = us.getClave();
            elementos[1] = us.getApellido();
            elementos[2] = us.getNombre();
            elementos[3] = us.getCi();
            elementos[4] = us.getTelefono();
            elementos[5] = us.getDireccion();
            elementos[6] = us.getEstado();
            
            tabla_usuarios.setFila(columnas);
        }
        */
        
        //tabla_usuarios.setModel(model);
        //tabla_usuarios.setRowHeight(30);
        
        //tabla_usuarios.getTableHeader().setDefaultRenderer(new Table_Header_P());
        //Perzonalizar_Celdas pers = new Perzonalizar_Celdas();

        //tabla_usuarios.setDefaultRenderer(Object.class, pers); // Personalizar celdas
      
        //tabla_usuarios.setDefaultEditor(Object.class, null); // Personalizar Header
        
        
        tabla_usuarios.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount() == 2) {
                    int fila = tabla_usuarios.rowAtPoint(e.getPoint());
                    int columna = 0;

                    if (fila > -1) {
                        String clave = tabla_usuarios.getValueAt(fila, columna).toString();
                        Usuario us = lista_usuario.stream().filter(persona -> persona.getClave().equals(clave)).findFirst().get();
                        D_AdmUsuario dialog_usuario = new D_AdmUsuario(null, true, us);
                        dialog_usuario.setVisible(true);
                    }
                }

            }

        });

    }
    

}
