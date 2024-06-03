/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev_team.services;

import com.dev_team.models.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DevMaik
 */
public class Service_Ventas implements I_Service{
    
    private final String TABLA = "tb_ventas";

    @Override
    public boolean crear(Object objeto) {
        Venta ventas = (Venta) objeto;
        Connection cnt = Conexion.conectar();
        String sql = String.format("INSERT INTO %s (cantidad, precioUnitario, descuento, subtotal, total, metodoPago, idCliente, idProducto, idUsuario) VALUES (?,?,?,?,?,?,?,?,?)", TABLA);
        try(PreparedStatement pst = cnt.prepareStatement(sql)){
            pst.setDouble(1, ventas.getCantidad());
            pst.setDouble(2, ventas.getPrecioUnitario());
            pst.setDouble(3, ventas.getDescuento());
            pst.setDouble(4, ventas.getSubTotal());
            pst.setDouble(5, ventas.getTotal());
            pst.setString(6, ventas.getMetodoPago());
            pst.setLong(7, ventas.getIdCliente());
            pst.setLong(8, ventas.getIdProducto());
            pst.setLong(9, ventas.getIdUsuario());
            
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
            System.err.println("Erro en registrar Venta: "+e.getMessage());
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
