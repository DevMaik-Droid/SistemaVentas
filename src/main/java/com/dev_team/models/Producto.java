package com.dev_team.models;

import java.util.Date;
import lombok.Data;

@Data
public class Producto {

    //Atributos
    private Long idProducto;
    private String claveProducto;
    private Double precioUnitario;
    private Double precioTotal;
    private Integer stock;
    private String disponibilidad;
    private Long idProveedor;
    private Long idUsuario;
    private Date fechaModicacion;
    
}
