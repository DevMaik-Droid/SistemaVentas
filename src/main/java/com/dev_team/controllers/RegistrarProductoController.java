
package com.dev_team.controllers;

import com.dev_team.models.Componente;
import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarProducto;
import java.util.ArrayList;
import java.util.List;

public class RegistrarProductoController extends V_RegistrarProducto{

    
    public RegistrarProductoController() {
        
        
        cbx_categoria.addActionListener(x -> {
            cargarCBXClave( cbx_categoria.getSelectedItem().toString());

        });
        
        
        
    }
    
    private void cargarCBXClave(String categoria){
        
        
        if(categoria.equalsIgnoreCase("COMPONENTE")){
            Service_Componente svc = new Service_Componente();
            List<Componente> lista_producto = (List<Componente>) svc.listarClaves();
            lista_producto.forEach(x -> cbx_clave.addItem(x.getClave()));

        }

    }
    
    
    
    
    
}
