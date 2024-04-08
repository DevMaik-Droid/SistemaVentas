
package com.dev_team.services;

import com.dev_team.models.PlacaMadre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Service_Componente {
    
    
    
    
    private final String TABLA = "motherboard";
    
    
    public List<PlacaMadre> listarPlacas(){
        Connection cn = Conexion.conectar();
        List<PlacaMadre> placas = null;
        
        try {
            String sql = String.format("SELECT * FROM %s", TABLA);
            PreparedStatement pst = cn.prepareStatement(sql);
            
            ResultSet rst = pst.executeQuery();
            
            placas = new ArrayList<>();
            while(rst.next()){
                PlacaMadre placaMadre = new PlacaMadre();
                placaMadre.setId(rst.getInt(1));
                placaMadre.setMarca(rst.getString(2));
                placaMadre.setModelo(rst.getString(3));
                placaMadre.setSocket_procesador(rst.getString(4));
                placaMadre.setChipset(rst.getString(5));
                placaMadre.setFormato(rst.getString(6));
                placaMadre.setPrecio(rst.getDouble(7));
                placaMadre.setCantidad(8);
                
                placas.add(placaMadre);
            }

            
        } catch (SQLException e) {
        }
        
        
        return placas;
        
    }
    
}
