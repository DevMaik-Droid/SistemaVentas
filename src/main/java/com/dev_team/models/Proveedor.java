package com.dev_team.models;
//Atributos

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data
@NoArgsConstructor
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

    public Proveedor(Long idProveedor, String nombre) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}
