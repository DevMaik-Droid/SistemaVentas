package com.dev_team.models;
//Atributos

import java.util.Objects;


public class Proveedor {

    private Long idProveedor;
    private String nombre;
    private String contacto;
    private String email;
    private String direccion;
    private String observaciones;

    public Proveedor(Long idProveedor, String nombre) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
    }

//Constructor vacío
    public Proveedor() {

        this.idProveedor = 0L;
        this.nombre = "";
        this.observaciones = "";
        this.email = "";
        this.direccion = "";
        this.contacto = "";
    }

    public Long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return getNombre();
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedor, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.idProveedor, other.idProveedor);
    }
    
}
