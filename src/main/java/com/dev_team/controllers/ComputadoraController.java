package com.dev_team.controllers;

import com.dev_team.models.Componente;
import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarComputadora;
import java.util.Comparator;
import java.util.List;

public class ComputadoraController extends V_RegistrarComputadora {

    private double precio;

    public ComputadoraController() {
        cargarComboBox();
        /*cbx_procesadorCO.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_caseCO.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_disipadores.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_discoCO.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_gpu.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_ramCO.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_fuente.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_tarjetaMadre.addActionListener(e -> {
            actualizarPrecio();

        });
        cbx_ventiladores.addActionListener(e -> {
            actualizarPrecio();

        });*/
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
/*
    private void actualizarPrecio() {

        Componente case1 = (Componente) cbx_caseCO.getSelectedItem();
        Componente cpu = (Componente) cbx_procesadorCO.getSelectedItem();
        Componente gpu = (Componente) cbx_gpu.getSelectedItem();
        Componente disco = (Componente) cbx_discoCO.getSelectedItem();
        Componente disipador = (Componente) cbx_disipadores.getSelectedItem();
        Componente fuente = (Componente) cbx_fuente.getSelectedItem();
        Componente monitor = (Componente) cbx_monitor.getSelectedItem();
        Componente ram = (Componente) cbx_ramCO.getSelectedItem();
        Componente placa = (Componente) cbx_tarjetaMadre.getSelectedItem();
        Componente ventilador = (Componente) cbx_ventiladores.getSelectedItem();

        List<Double> precios = List.of(case1.getPrecioUnitario(), cpu.getPrecioUnitario(), gpu.getPrecioUnitario(),
                disco.getPrecioUnitario(), disipador.getPrecioUnitario(), fuente.getPrecioUnitario(), monitor.getPrecioUnitario(), ram.getPrecioUnitario(), placa.getPrecioUnitario(), ventilador.getPrecioUnitario());
       
        double precioTotal = precios.stream().reduce(0.0, Double::sum);
        // Dar formato al precio final
        String precioFormateado = String.format("%.2f", precioTotal) + " USD";
       tf_precio.setText(precioFormateado);
        
    }
*/
}
