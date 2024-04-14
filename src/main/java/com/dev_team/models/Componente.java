
package com.dev_team.models;

import java.io.InputStream;
import lombok.Data;

@Data
public class Componente {
    
    private Integer idComponente;
    private String componente;
    private String marca;
    private String modelo;
    private String capacidad;
    private String velocidad;
    private Long idProveedor;
    private Double precio;
    private Integer cantidad;
    private String disponibilidad;
    private InputStream imagen;
    private String descripcion;

}
