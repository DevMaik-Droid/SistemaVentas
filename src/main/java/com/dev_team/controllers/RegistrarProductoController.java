package com.dev_team.controllers;

import com.dev_team.models.Accesorios;
import com.dev_team.models.Componente;
import com.dev_team.models.Proveedor;
import com.dev_team.services.Service_Accesorios;
import com.dev_team.services.Service_Componente;
import com.dev_team.services.Service_Proveedor;
import com.dev_team.views.V_RegistrarProducto;
import java.util.List;

public class RegistrarProductoController extends V_RegistrarProducto {

    public RegistrarProductoController() {
        ta_detalle.setEditable(false);
        cbx_categoria.addActionListener(x -> {
            cbx_clave.removeAllItems();
            cbx_proveedor.removeAllItems();
            String categoria = cbx_categoria.getSelectedItem().toString();
            cargarCBXClave(categoria);
            cargarCbxProveedor(categoria);
        });

        cbx_clave.addActionListener(x -> {
            generarTexto(cbx_clave.getSelectedItem().toString());
        });

    }

    private void cargarCBXClave(String categoria) {

        if (categoria.equalsIgnoreCase("COMPONENTES")) {
            Service_Componente svc = new Service_Componente();
            List<Componente> lista_producto = (List<Componente>) svc.listarClaves();
            lista_producto.forEach(x -> cbx_clave.addItem(x.getClave()));

        } else if (categoria.equalsIgnoreCase("ACCESORIOS")) {
            Service_Accesorios svc = new Service_Accesorios();
            List<Accesorios> lista_producto = (List<Accesorios>) svc.listarClaves();
            lista_producto.forEach(x -> cbx_clave.addItem(x.getClaveAccesorio()));
        }
    }

    private void cargarCbxProveedor(String categoria) {
        List<Proveedor> proveedor = (List<Proveedor>) new Service_Proveedor().listar();
        proveedor.stream()
                .filter(p -> p.getProductoSuministrado().equalsIgnoreCase(categoria))
                .forEach(x -> cbx_proveedor.addItem(x));
    }

    private void generarTexto(String clave) {

        Service_Componente svc = new Service_Componente();
        Componente componente = svc.buscarCompenente(clave);
        String txt = " Nombre: " + componente.getNombre()
                +"\n Marca: "+ componente.getMarca()
                +"\n Modelo: "+ componente.getModelo()
                +"\n Capacidad: "+ ((componente.getCapacidad() != null)?componente.getCapacidad():"No tiene")
                +"\n Velocidad: "+ ((componente.getVelocidad()!= null)?componente.getVelocidad():"No tiene");
        
        
        ta_detalle.setText(txt);

    }

}
