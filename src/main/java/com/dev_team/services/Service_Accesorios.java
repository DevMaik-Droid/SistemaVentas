/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.services;

import com.dev_team.models.Accesorios;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author DevMaik
 */
public class Service_Accesorios implements I_Service{

    
    private final String TABLA = "tb_accesorios";
            
    @Override
    public boolean crear(Object objeto) {
       
        Connection cnt = Conexion.conectar();
        Accesorios accesorios = (Accesorios) objeto;
        String sql = String.format("INSERT INTO %s VALUES (?,?,?,?,?,?,?,?,?,?,?)", TABLA);
        
        try (PreparedStatement pst = cnt.prepareStatement(sql)){
            pst.setInt(1, 0);//id
            pst.setString(2, accesorios.getNombre());
            pst.setString(3, accesorios.getMarca());
            pst.setString(4, accesorios.getDescripcion());
            pst.setInt(5, accesorios.getCantidad());
            pst.setDouble(6, accesorios.getPrecioUnitario());
            pst.setDouble(7, accesorios.getPrecioTotal());
            pst.setLong(8, accesorios.getIdProveedor());
            pst.setLong(9, accesorios.getIdUsuario());
            pst.setBinaryStream(10, accesorios.getImagen());
            pst.setDate(11, new Date(accesorios.getFechaRegistro().getTime()));
            
            return pst.executeUpdate() > 0;
        } catch (Exception e) {
            System.out.println("Error en la consulta: " + e);
        }
        return false;
    
    }

    @Override
    public boolean actualizar(Object objeto, String L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<?> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Long L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
