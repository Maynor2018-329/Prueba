/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.maynorAlvarez.bean;

/**
 *
 * @author IS4TECH
 */
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private int numero;

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, int numero) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero = numero;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
