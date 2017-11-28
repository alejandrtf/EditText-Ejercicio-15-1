package com.android.alejandra.edittextejer15_1.model;

/**
 * Created by Sandra on 05/11/2017.
 */

public class Contacto {
    private String nombre,
            apellidos,
            email,
            direccion,
            comunidad,
            comentarios;
    private long tfno;

    //CONSTRUCTOR
    public Contacto(String nombre, String apellidos, String email, String direccion, String comunidad, String comentarios, String tfno) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.direccion = direccion;
        this.comunidad = comunidad;
        this.comentarios = comentarios;
        if (!tfno.isEmpty())
            this.tfno = Long.parseLong(tfno);
    }


    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public long getTfno() {
        return tfno;
    }

    public void setTfno(long tfno) {
        this.tfno = tfno;
    }


    //TOSTRING

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comunidad='" + comunidad + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", tfno=" + tfno +
                '}';
    }
}
