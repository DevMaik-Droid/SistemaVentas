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

        cbx_clave.addActionListener(xx -> {
            if (cbx_clave.getSelectedIndex() > 0) {
                String categoria = cbx_categoria.getSelectedItem().toString();
                String clave = cbx_clave.getSelectedItem().toString();
                generarTexto(clave, categoria);
            }

        });

        cbx_categoria.addActionListener(x -> {
            cbx_clave.removeAllItems();
            cbx_proveedor.removeAllItems();
            String categoria = cbx_categoria.getSelectedItem().toString();
            cargarCBXClave(categoria);
            cargarCbxProveedor(categoria);
        });

    }

    private void cargarCBXClave(String categoria) {
        cbx_clave.addItem("Seleccione Clave");
        if (categoria.equalsIgnoreCase("COMPONENTES")) {

            Service_Componente svc = new Service_Componente();
            List<Componente> lista_producto = (List<Componente>) svc.listarClaves();
            lista_producto.forEach(x -> cbx_clave.addItem(x.getClave()));

        } else if (categoria.equalsIgnoreCase("ACCESORIOS")) {
            Service_Accesorios svc = new Service_Accesorios();
            List<Accesorios> lista_producto = (List<Accesorios>) svc.listarClaves();
            lista_producto.forEach(x -> cbx_clave.addItem(x.getClaveAccesorio()));

        } else {

        }
    }

    private void cargarCbxProveedor(String categoria) {
        List<Proveedor> proveedor = (List<Proveedor>) new Service_Proveedor().listar();
        proveedor.stream()
                .filter(p -> p.getProductoSuministrado().equalsIgnoreCase(categoria))
                .forEach(x -> cbx_proveedor.addItem(x));
    }

    private void generarTexto(String clave, String categoria) {
        String txt = "";
        System.out.println(clave);
        if (categoria.equalsIgnoreCase("Componentes")) {
            Service_Componente svc = new Service_Componente();
            Componente componente = svc.buscarCompenente(clave);
            txt = " Nombre: " + componente.getNombre()
                    + "\n Marca: " + componente.getMarca()
                    + "\n Modelo: " + componente.getModelo()
                    + "\n Capacidad: " + ((componente.getCapacidad() != null) ? componente.getCapacidad() : "No tiene")
                    + "\n Velocidad: " + ((componente.getVelocidad() != null) ? componente.getVelocidad() : "No tiene");
        } else if (categoria.equalsIgnoreCase("Accesorios")) {
            Service_Accesorios svc = new Service_Accesorios();
            Accesorios accesorios = svc.buscarAccesorio(clave);
            txt = " Nombre: " + accesorios.getNombre()
                    + "\n Marca: " + accesorios.getMarca()
                    + "\n Modelo: " + accesorios.getModelo()
                    + "\n Descripcion: " + accesorios.getDescripcion();
        }

        ta_detalle.setText(txt);

    }
    
    
    private void registrarProducto(){
        
                                                                                                                       
        
    }

}
