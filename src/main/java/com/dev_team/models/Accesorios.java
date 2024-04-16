
package com.dev_team.models;

import java.io.InputStream;
import java.util.Date;
import lombok.Data;

@Data
public class Accesorios {
    private Integer idAccesorio;
    private String nombre;
    private String marca;
    private String descripcion;
    private Integer cantidad;
    private Double precioUnitario;
    private Double precioTotal;
    private Long idProveedor;
    private Long idUsuario;
    private InputStream imagen;
    private Date fechaRegistro;
}
