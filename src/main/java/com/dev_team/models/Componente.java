package com.dev_team.models;

import java.io.InputStream;
import java.util.Date;
import lombok.Data;

@Data
public class Componente {

    private Integer idComponente;
    private String componente;
    private String marca;
    private String modelo;
    private String capacidad;
    private String velocidad;
    private Double precioUnitario;
    private Double precioTotal;
    private Integer cantidad;
    private String disponibilidad;
    private InputStream imagen;
    private String descripcion;
    private Long idProveedor;
    private Long idUsuario;
    private Date fechaRegistro;

    @Override
    public String toString() {
        if (getComponente().contains("RAM")) {
            return getCapacidad() + ", " + getVelocidad() + " - " + getMarca() + "-" + getModelo();
        } else if (getComponente().contains("HDD") || getComponente().contains("SDD")) {
            String tipo = getComponente().contains("SSD") ? "SSD" : "HDD";
            return tipo + "-" + getCapacidad() + "," + getVelocidad();
        } else {
            return getMarca() + "-" + getModelo();
        }

    }
}
