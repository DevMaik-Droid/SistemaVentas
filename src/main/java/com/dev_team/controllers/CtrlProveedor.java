package com.dev_team.controllers;


import com.dev_team.models.Proveedor;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.vistas.InterProveedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CtrlProveedor extends InterProveedor implements ActionListener{

    public CtrlProveedor() {
        btn_Guardar.addActionListener(this);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (btn_Guardar==e.getSource()) {
            guardarProveedor();
        }
    }
    private void guardarProveedor(){
          if (txt_nombreP.getText().isEmpty() || txt_contactoP.getText().isEmpty() || txt_emailP.getText().isEmpty()
            || txt_direccionP.getText().isEmpty() || txt_observacionesP.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Completa todos los campos");
        } else {
            //validamos si el usuaro ya esta registrado
            Proveedor proveedor = new Proveedor();
            Service_Proveedor controlProveedor = new Service_Proveedor();
            if (!controlProveedor.existeProveedor(txt_emailP.getText().trim())) {
                //enviamos datos del proveedor
                proveedor.setNombre(txt_nombreP.getText().trim());
                proveedor.setContacto(txt_contactoP.getText().trim());
                proveedor.setEmail(txt_emailP.getText().trim());
                proveedor.setDireccion(txt_direccionP.getText().trim());
                proveedor.setObservaciones(txt_observacionesP.getText().trim());
            
                if (controlProveedor.crear(proveedor)) {
                    JOptionPane.showMessageDialog(null, "¡Proveedor Registrado!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Error al registrar Proveedor!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El Proveedor ya esta registrado, ingrese otro.");
            }
        }
        this.Limpiar();
    }   
    
 /**
     *
     * Metodo para limpiar campos
     */
    private void Limpiar() {
        txt_nombreP.setText("");
        txt_contactoP.setText("");
        txt_emailP.setText("");
        txt_direccionP.setText("");
        txt_observacionesP.setText("");
    }
    
}
