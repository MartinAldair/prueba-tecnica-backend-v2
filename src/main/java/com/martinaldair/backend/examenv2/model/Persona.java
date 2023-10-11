package com.martinaldair.backend.examenv2.model;

import java.io.Serializable;

/**
 *
 * @author Martin Aldair
 */
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id; // se declara esta variable como ID de tipo Entero

    private String nombre; // se declara esta variable como nombre de tipo String

    private String apellidos; // se declara esta variable como apellidos de tipo String

    private String rfc; // se declara esta variable como rfc de tipo String

    private String curp;  // se declara esta variable como curp de tipo String

    private Integer edad; // se declara esta variable como edad de tipo Entero

    private String sexo; // se declara esta variable como sexo de tipo String

    private String nacionalidad; // se declara esta variable como nacionalidad de tipo String

    /*
    Crea una instancia de persona.
     */
    public Persona(Integer id, String nombre, String apellidos, String rfc, String curp, Integer edad, String sexo, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.rfc = rfc;
        this.curp = curp;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    // Se agregan los getter y setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", rfc=" + rfc + ", curp=" + curp + ", edad=" + edad + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad + '}';
    }

}
