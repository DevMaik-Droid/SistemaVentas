package com.dev_team.controllers;


import com.dev_team.services.Service_Componente;
import com.dev_team.views.V_RegistrarComponentes;
import javax.swing.JLabel;


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

                actualizarComponentes("Marca","Modelo", "Socket Procesador","Chipset","Formato");

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

    private void actualizarComponentes(String ...x) {
        JLabel[] labels = {lb_1,lb_2,lb_3,lb_4,lb_5};
        
        for(JLabel lbs : labels){
            
        }
        
        
    }
    
   /* private void cargarCbxMotherboard() {
        
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
    }*/

    
}
