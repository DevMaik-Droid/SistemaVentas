package com.dev_team.models;
//Atributos

import java.util.Date;
import lombok.Data;


@Data
public class Proveedor {

    private Long idProveedor;
    private String nombre;
    private String contacto;
    private String email;
    private String productoSuministrado;
    private String direccion;
    private String estadoPago;
    private Date fechaRegistro;
    private String observaciones;
    private String estado;

}
