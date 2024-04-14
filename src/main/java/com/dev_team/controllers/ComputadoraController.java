
package com.dev_team.controllers;

import com.dev_team.models.Componente;
import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarComputadora;
import java.util.Comparator;
import java.util.List;


public class ComputadoraController extends V_RegistrarComputadora{

    public ComputadoraController() {
        cargarComboBox();
        
    }

    
    
    
    
    private void cargarComboBox() {
        List<Componente> componentes = (List<Componente>) new Service_Componente().listar();
        
        componentes.stream()
                .filter(c -> c.getComponente().contains("Placa")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_tarjetaMadre::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("CPU")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_procesadorCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("RAM")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_ramCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("Almacenamiento")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_discoCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("GPU")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_gpu::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().contains("Fuente")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_fuente::addItem);
         componentes.stream()
                .filter(c -> c.getComponente().equals("Case")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_caseCO::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Monitor")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_monitor::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Ventiladores")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_ventiladores::addItem);
        componentes.stream()
                .filter(c -> c.getComponente().equals("Disipador")).sorted(Comparator.comparing(Componente::getModelo).reversed())
                .forEach(cbx_disipadores::addItem);
        
    }
    
    
    
    
    
}
