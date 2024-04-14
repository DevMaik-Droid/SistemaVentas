package com.dev_team.services;

import com.dev_team.models.Componente;
import com.dev_team.models.PlacaMadre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Service_Componente implements I_Service {

    private final String TABLA = "tb_componente";

    @Override
    public boolean crear(Object objeto) {
        Connection cn = Conexion.conectar();
        Componente componente = (Componente) objeto;
        String sql = String.format("INSERT INTO %s VALUES (?,?,?,?,?,?,?,?,?,?,?,?)", TABLA);

        try (PreparedStatement consulta = cn.prepareStatement(sql)) {
            consulta.setInt(1, 0);//id
            consulta.setString(2, componente.getComponente());
            consulta.setString(3, componente.getMarca());
            consulta.setString(4, componente.getModelo());
            consulta.setString(5, componente.getCapacidad());
            consulta.setString(6, componente.getVelocidad());
            consulta.setLong(7, componente.getIdProveedor());
            consulta.setDouble(8, componente.getPrecio());
            consulta.setInt(9, componente.getCantidad());
            consulta.setString(10, componente.getDisponibilidad());
            consulta.setBinaryStream(11, componente.getImagen());
            consulta.setString(12, componente.getDescripcion());

            return consulta.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Service_Componente.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public List<PlacaMadre> listarPlacas() {
        Connection cn = Conexion.conectar();
        List<PlacaMadre> placas = null;

        try {
            String sql = String.format("SELECT * FROM %s", TABLA);
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rst = pst.executeQuery();

            placas = new ArrayList<>();
            while (rst.next()) {
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

    @Override
    public boolean actualizar(Object objeto, String L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<?> listar() {
        
        Connection cn = Conexion.conectar();
        List<Componente> componente = null;

        try {
            String sql = String.format("SELECT * FROM %s", TABLA);
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rst = pst.executeQuery();

            componente = new ArrayList<>();
            while (rst.next()) {
                Componente comp = new Componente();
                comp.setIdComponente(rst.getInt("idc"));
                comp.setComponente(rst.getString("componente"));
                comp.setMarca(rst.getString("marca"));
                comp.setModelo(rst.getString("modelo"));
                comp.setCapacidad(rst.getString("capacidad"));
                comp.setVelocidad(rst.getString("velocidad"));
                comp.setPrecio(rst.getDouble("precio"));
                componente.add(comp);
            }

        } catch (SQLException e) {
        }

        return componente;
        
    
    }

    @Override
    public boolean eliminar(Long L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
