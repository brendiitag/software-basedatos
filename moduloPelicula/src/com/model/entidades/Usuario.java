/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.model.entidades;

import java.util.Date;

/**
 *
 * @author T-205
 */
public class Usuario {

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String email, Date fechaCreacion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.fechaCreacion = fechaCreacion;
    }
    private int idUsuario;
     private String nombre;
     private String email;
     private Date fechaCreacion;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
     }