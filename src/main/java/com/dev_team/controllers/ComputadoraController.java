
package com.dev_team.controllers;

import com.dev_team.models.Componente;
import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarComputadora;
import java.util.List;


public class ComputadoraController extends V_RegistrarComputadora{

    public ComputadoraController() {
        cargarComboBox();
        
    }

    
    
    
    
    private void cargarComboBox() {
        List<Componente> componentes = (List<Componente>) new Service_Componente().listar();
        
        componentes.stream()
                .filter(c -> c.getComponente().contains("Placa"))
                .forEach(cbx_tarjetaMadre::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("CPU"))
                .forEach(cbx_procesadorCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("RAM"))
                .forEach(cbx_ramCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("Almacenamiento"))
                .forEach(cbx_discoCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("GPU"))
                .forEach(cbx_gpu::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("Fuente"))
                .forEach(cbx_fuente::addItem);
         componentes.stream()
                .filter(c -> c.getComponente().equals("Case"))
                .forEach(cbx_caseCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Monitor"))
                .forEach(cbx_monitor::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Ventiladores"))
                .forEach(cbx_ventiladores::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Disipador"))
                .forEach(cbx_disipadores::addItem);
        
    }

    
    
    
    
    
}
