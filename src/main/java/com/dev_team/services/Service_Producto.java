package com.dev_team.services;

import com.dev_team.models.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Service_Producto implements I_Service {

    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDDcomo
     * ********************************************************************
     */
    
    private final String TABLA = "tb_productos";
    
    
    public boolean existeProducto(String producto) {
        boolean respuesta = false;
        String sql = "select nombre from tb_producto where nombre = '" + producto + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar producto: " + e);
        }
        return respuesta;
    }
    

    @Override
    public boolean crear(Object objeto) {
        Connection cn = Conexion.conectar();
        Producto producto = (Producto) objeto;
        String sql = String.format("INSERT INTO %s (claveProducto,nombreProducto,categoriaProducto,precioUnitario,stock, precioTotal,idProveedor,idUsuario,detalle) VALUES (?,?,?,?,?,?,?,?,?)", TABLA);
        try {

            PreparedStatement consulta = cn.prepareStatement(sql);
            consulta.setString(1, producto.getClaveProducto());
            consulta.setString(2, producto.getNombreProducto());
            consulta.setString(3, producto.getCategoriaProducto());
            consulta.setDouble(4, producto.getPrecioUnitario());
            consulta.setInt(5, producto.getStock());
            consulta.setDouble(6, producto.getPrecioTotal());
            consulta.setLong(7, producto.getIdProveedor());
            consulta.setLong(8, producto.getIdUsuario());
            consulta.setString(9, producto.getDetalle());
            if (consulta.executeUpdate() > 0) {
                return true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar producto: " + e);
        }

        return false;
    }

   /* @Override
    public boolean actualizar(Object objeto, Long L) {
       boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_producto set nombre=?, cantidad = ?, precio = ?, descripcion= ?, porcentajeIva = ?, idCategoria = ?, estado = ? where idProducto ='" + idProducto + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setInt(2, objeto.getCantidad());
            consulta.setDouble(3, objeto.getPrecio());
            consulta.setString(4, objeto.getDescripcion());
            consulta.setInt(5, objeto.getPorcentajeIva());
            consulta.setInt(6, objeto.getIdCategoria());
            consulta.setInt(7, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar producto: " + e);
        }
        return respuesta;    }
*/
    @Override
    public List<?> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Long idProducto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_producto where idProducto ='" + idProducto + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar producto: " + e);
        }
        return respuesta;
    }

    @Override
    public boolean actualizar(Object objeto, String L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
