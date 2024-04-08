package com.dev_team.controllers;

import com.dev_team.views.V_RegistrarComponentes;
import java.util.Arrays;

public class ComponentController extends V_RegistrarComponentes {

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
        //Agregar Marcas al combo box
        String[] marcas = {"ASUS", "GIGABYTE", "MSI"};
        Arrays.stream(marcas).forEach(x -> cbx_marcaC.addItem(x));

        String[] modelos_asus = {"ASUS ROG Strix Z690-E Gaming WIFI", "ASUS TUF Gaming Z690-Plus WIFI D4", "ASUS Prime Z690-A", "ASUS ROG Maximus Z690 Hero", "ASUS TUF Gaming B560M-Plus WIFI", "ASUS Prime B560-Plus"};
        String[] modelos_gigabyte = {"GIGABYTE Z690 AORUS Ultra", "GIGABYTE B660 AORUS PRO AX DDR4", "GIGABYTE Z690 AORUS Master DDR4", "GIGABYTE B660M AORUS ELITE DDR4", "GIGABYTE Z590 AORUS Elite AX DDR4"};
        String[] modelos_msi = {"MSI MPG Z690 GAMING CARBON WIFI", "MSI MAG B660 TOMAHAWK DDR4", "MSI MEG Z690 GODLIKE DDR4", "MSI MAG B660M MORTAR WIFI DDR4"};

        
        cbx_marcaC.addActionListener(e -> {
            
            String marcaSelecionada = cbx_marcaC.getSelectedItem().toString();
            switch (marcaSelecionada) {
                case "ASUS" ->
                    cargarCbxModelo(modelos_asus);
                case "GIGABYTE" ->
                    cargarCbxModelo(modelos_gigabyte);
                case "MSI" ->
                    cargarCbxModelo(modelos_msi);
                default -> {
                    System.out.println("Error");
                }
            }
        });

    }

    private void cargarCbxModelo(String[] modelos) {
        cbx_modeloC.removeAllItems();
        Arrays.stream(modelos).forEach(x -> cbx_modeloC.addItem(x));
    }
}
