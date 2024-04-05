package com.dev_team.services;

import com.dev_team.models.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Service_Categoria implements I_Service {

    /**
     * **************************************************
     * metodo para crear una nueva categoria
     * *************************************************
     */
    @Override
    public boolean crear(Object objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        Categoria ct = (Categoria) objeto;
        try {

            PreparedStatement consulta = cn.prepareStatement("insert into tb_categoria values(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, ct.getDescripcion());
            consulta.setInt(3, ct.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar cartegoria: " + e);
        }

        return respuesta;
    }

    /**
     * ********************************************************************
     * metodo para consultar si la categoria registrado ya existe
     * ********************************************************************
     */
    public boolean existeCategoria(String categoria) {
        boolean respuesta = false;
        String sql = "select categoria from tb_categoria where categoria = '" + categoria + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar cartegoria: " + e);
        }
        return respuesta;
    }

    /**
     * **************************************************
     * metodo para actualizar una nueva categoria
     * **************************************************
     */
    @Override
    public boolean actualizar(Object objeto, String idCategoria) {
        boolean respuesta = false;
        Categoria ct = (Categoria) objeto;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement("update tb_categoria set categoria=? where idCategoria ='" + idCategoria + "'");
            consulta.setString(1, ct.getDescripcion());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar cartegoria: " + e);
        }

        return respuesta;
    }

    /**
     * **************************************************
     * metodo para eliminar una nueva categoria
     * **************************************************
     */
    @Override
    public boolean eliminar(Long idCategoria) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        try {

            PreparedStatement consulta = cn.prepareStatement(
                    "delete from tb_categoria where idCategoria ='" + idCategoria + "'");
            consulta.executeUpdate();

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }

            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar cartegoria: " + e);
        }

        return respuesta;
    }

    @Override
    public List<?> listar() {
        List<Categoria>lista = new ArrayList<>();
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        try {
            PreparedStatement consulta = cn.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()) {
                Categoria ct = new Categoria();
                ct.setIdCategoria(resultado.getLong(1));
                ct.setDescripcion(resultado.getString(2));
                lista.add(ct);

            }
        } catch (SQLException ex) {

        }
        return lista;
    }
}
