package com.dev_team.models;

import java.io.InputStream;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Usuario {

    //Atributos
    private Long idUsuario; 
    private String nombre;
    private String apellido;
    private String ci;
    private Date fechaNacimiento;
    private String telefono;
    private String direccion;
    private String usuario;
    private String password;
    private String clave;
    private InputStream foto;
    private int estado;
    private String observaciones;
    
    private byte[] bytes_image;
    private Boolean nueva_imagen;

}
