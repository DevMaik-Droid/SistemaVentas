package com.dev_team.controllers;

import com.dev_team.models.Proveedor;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.views.V_RegistrarProveedor;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ProveedorController extends V_RegistrarProveedor {

    public ProveedorController() {

        btn_registrar.addActionListener(e -> {
            registrarProveedor();

        });

    }

    private void registrarProveedor() {

        if (validarCampos()) {
            Service_Proveedor service = new Service_Proveedor();
            Proveedor proveedor = new Proveedor();
            proveedor.setNombre(tf_nombreProveedor.getText().trim());
            proveedor.setContacto(tf_contacto.getText().trim());
            proveedor.setDireccion(tf_direccion.getText().trim());
            proveedor.setEmail(tf_email.getText().trim());

            if (cbx_productoSuministrado.getSelectedIndex() > 0) {
                proveedor.setProductoSuministrado(cbx_productoSuministrado.getSelectedItem().toString());
            } else {
                mostrarMensaje("Seleccione producto suministrado");
            }

            proveedor.setFechaRegistro(dc_fechaRegistro.getDate());

            if (cbx_estadoDePago.getSelectedIndex() > 0) {
                proveedor.setEstadoPago(cbx_estadoDePago.getSelectedItem().toString());
            } else {
                mostrarMensaje("Seleccione estado de pago");
            }

            proveedor.setObservaciones(ta_informacionAdicional.getText());

            if (service.crear(proveedor)) {
                mostrarMensaje("Proveedor Registrado");
                LimpiarCampos();
            } else {
                mostrarMensaje("Error en registrar");
            }
        }else{
            mostrarMensaje("Debe llenar todos los campos");
        }

    }

    private boolean validarCampos() {
        boolean valido = true;

        JTextField[] tfs = {tf_contacto, tf_direccion, tf_email, tf_nombreProveedor};
        for (JTextField f : tfs) {
            if (f.getText().isEmpty()) {
                valido = false;
                break;
            }
        }

        return valido;
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
    
    private void LimpiarCampos(){
        JTextField[] tfs = {tf_contacto, tf_direccion, tf_email, tf_nombreProveedor};
        for (JTextField f : tfs) {
            f.setText("");
        }
        cbx_estadoDePago.setSelectedIndex(0);
        cbx_productoSuministrado.setSelectedIndex(0);
    }
}
