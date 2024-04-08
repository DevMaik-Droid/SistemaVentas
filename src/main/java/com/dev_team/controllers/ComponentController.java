package com.dev_team.controllers;

import com.dev_team.models.PlacaMadre;
import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarComponentes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ComponentController extends V_RegistrarComponentes {

    
    
    private Service_Componente service = new Service_Componente();
    
    public ComponentController() {

     
        
        cbx_componente.addActionListener(c -> {

            String componente = cbx_componente.getSelectedItem().toString();
            actualizarComponentes(componente);

        });

    }

    private void actualizarComponentes(String componente) {

        if (componente.contains("Motherboard")) {

            cargarCbxMotherboard();

        } else if (componente.contains("CPU")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("RAM")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("SDD")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("GPU")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("Fuente")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("Disipador")) {
            System.out.println("Tarjeta Grafica");
        } else if (componente.contains("Case")) {
            System.out.println("Tarjeta Grafica");
        }

    }

    private void cargarCbxMotherboard() {
        
        List<PlacaMadre> placas = service.listarPlacas();
        
        //Agregar Marcas al combo box
        Set<String> marcas = new HashSet<>();
        
        placas.forEach(p -> marcas.add(p.getMarca()));

        marcas.forEach(x -> cbx_marcaC.addItem(x));
        
        List<String> modelos = new ArrayList<>();
        
        cbx_marcaC.addActionListener(e -> {
            
            String marcaSelecionada = cbx_marcaC.getSelectedItem().toString();
            placas.stream()
                    .filter(placa -> placa.getMarca().equals(marcaSelecionada))
                    .forEach(x -> modelos.add(x.getModelo()));
            
            cargarCbxModelo(modelos.toArray());
            modelos.clear();
            
        });

    }

    private void cargarCbxModelo(Object[] modelos) {
        cbx_modeloC.removeAllItems();
       
        Arrays.stream(modelos).forEach(x -> cbx_modeloC.addItem(x.toString()));
    }
}
