package com.dev_team.services;

import com.dev_team.models.Usuario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Service_Usuario implements I_Service {

    
    
    //Registrar Usuario
    private final static String TABLA = "tb_usuario";
    
    @Override
    public boolean crear(Object objeto) {
        boolean respuesta = false;
        Usuario usuario = (Usuario) objeto;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into tb_usuario values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setInt(1, 0);//id
            consulta.setString(2, usuario.getNombre());
            consulta.setString(3, usuario.getApellido());
            consulta.setString(4, usuario.getCi());
            consulta.setDate(5, new Date(usuario.getFechaNacimiento().getTime()));
            consulta.setString(6, usuario.getTelefono());
            consulta.setString(7, usuario.getDireccion());
            consulta.setString(8, usuario.getUsuario());
            consulta.setString(9, usuario.getPassword());
            consulta.setBinaryStream(10, usuario.getFoto());
            consulta.setString(11, usuario.getClave());
            consulta.setInt(12, usuario.getEstado());
            consulta.setString(13, usuario.getObservaciones());
            
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar usuario: " + e);
        }
        return respuesta;
    }



    /**
     * ********************************************************************
     * metodo para consultar si el producto ya esta registrado en la BBDD
     * ********************************************************************
     */
    public boolean existeUsuario(String usuario) {
        boolean respuesta = false;
        String sql = "select usuario from tb_usuario where usuario = '" + usuario + "';";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para Iniciar Sesion
     * **************************************************
     */
    public boolean loginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select  usuario, password from tb_usuario where usuario = '" + objeto.getUsuario() + "' and password = '" + objeto.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al Iniciar Sesion");
            JOptionPane.showMessageDialog(null, "Error al Iniciar Sesion");
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar un usuario
     * **************************************************
     */
    public boolean actualizar(Usuario objeto, Long idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_usuario set nombre=?, apellido = ?, usuario = ?, password= ?, telefono = ?, estado = ? where idUsuario ='" + idUsuario + "'");
            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getUsuario());
            consulta.setString(4, objeto.getPassword());
            consulta.setString(5, objeto.getTelefono());
            consulta.setInt(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al actualizar usuario: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar un usuario
     * **************************************************
     */
    public boolean eliminar(Long idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {
            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_usuario where idUsuario ='" + idUsuario + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al eliminar usuario: " + e);
        }
        return respuesta;
    }

    @Override
    public boolean actualizar(Object objeto, Long L) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<?> listar() {
        List<Usuario> lista_usuarios = null;
        try(Connection cn = Conexion.conectar()){
            
            String sql = String.format("SELECT * FROM %s", TABLA);
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            lista_usuarios = new ArrayList<>();
            
            while(rst.next()){
                Usuario us = new Usuario();
                us.setIdUsuario(rst.getLong("idUsuario"));
                us.setNombre(rst.getString("nombre"));
                us.setApellido(rst.getString("apellido"));
                us.setCi(rst.getString("ci"));
                us.setFechaNacimiento(rst.getDate("fecha_nacimiento"));
                us.setTelefono(rst.getString("telefono"));
                us.setDireccion(rst.getString("direccion"));
                us.setUsuario(rst.getString("usuario"));
                us.setPassword(rst.getString("contrasenia"));
                us.setBytes_image(rst.getBytes("foto"));
                us.setClave(rst.getString("clave"));
                us.setEstado(rst.getInt("estado"));
                us.setObservaciones(rst.getString("observaciones"));
                lista_usuarios.add(us);
            }
            cn.close();
        }catch(SQLException e){
            
        }
       
        return lista_usuarios;
    }
}
