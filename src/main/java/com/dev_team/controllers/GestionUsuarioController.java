/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.controllers;

import com.dev_team.models.Usuario;
import com.dev_team.services.Service_Usuario;
import com.dev_team.views.D_AdmUsuario;
import com.dev_team.views.V_GestionarUsuario;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DevMaik
 */
public class GestionUsuarioController extends V_GestionarUsuario {

    public GestionUsuarioController() {

        GenerarTabla();
    }

    public final void GenerarTabla() {
        Service_Usuario serv_usuario = new Service_Usuario();

        List<Usuario> lista_usuario = (List<Usuario>) serv_usuario.listar();

        Object[] columnas = {"Clave", "Apellido", "Nombre", "Telefono", "Direccion", "Estado"};

        DefaultTableModel model = new DefaultTableModel(columnas, 0);

        for (Usuario us : lista_usuario) {
            Object[] elementos = new Object[columnas.length];

            elementos[0] = us.getClave();
            elementos[1] = us.getApellido();
            elementos[2] = us.getNombre();
            elementos[3] = us.getTelefono();
            elementos[4] = us.getDireccion();
            elementos[5] = us.getEstado();

            model.addRow(elementos);
        }

        tabla_usuarios.setModel(model);
        
        tabla_usuarios.setDefaultEditor(Object.class, null);
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
