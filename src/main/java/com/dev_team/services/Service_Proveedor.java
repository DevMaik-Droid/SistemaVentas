package com.dev_team.services;

import com.dev_team.models.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Service_Proveedor implements I_Service{
    /**
     * **************************************************
 metodo para crear un nuevo proveedor
 **************************************************
     */
    @Override
    public boolean crear(Object objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Proveedor pr = (Proveedor) objeto;
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_proveedor values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, pr.getNombre());
            consulta.setString(3, pr.getContacto());
            consulta.setString(4, pr.getEmail());
            consulta.setString(5, pr.getDireccion());
            consulta.setString(6, pr.getObservaciones());    
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar proveedor: " + e);
        }
        return respuesta;
    }

    public boolean existeProveedor(String proveedor) {
        boolean respuesta = false;
        String sql = "select proveedor from tb_proveedor where proveedor = '" + proveedor + "';";
        PreparedStatement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar proveedor: " + e);
        }
        return respuesta;
    }


     // metodo para actualizar un proveedor
   
    @Override
    public boolean actualizar(Object objeto, String idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Proveedor pr = (Proveedor) objeto;
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_proveedor set proveedor=?, contacto = ?, email = ?, direccion= ?, observaciones = ?  where idProveedor ='" + idProveedor + "'");
            consulta.setString(1, pr.getNombre());
            consulta.setString(2, pr.getContacto());
            consulta.setString(3, pr.getEmail());
            consulta.setString(4, pr.getDireccion());
            consulta.setString(5, pr.getObservaciones());   

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar proveedor: " + e);
        }
        return respuesta;
    }
    /**
     * **************************************************
     * metodo para eliminar un proveedor
     * **************************************************
     */
    @Override
    public boolean eliminar(Long idProveedor) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_proveedor where idProveedor ='" + idProveedor + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar proveedor: " + e);
        }
        return respuesta;
    }

    @Override
    public List<?> listar() {
        List<Proveedor> lista= new ArrayList<>();
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_proveedor";
        try {
            PreparedStatement consulta = cn.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {     
                Proveedor pr = new Proveedor();
                pr.setIdProveedor(resultado.getLong(1));
                pr.setNombre(resultado.getString(2));
                lista.add(pr);
             
            }
        } catch (SQLException ex) {
            
        }
        return lista;
    }


}
