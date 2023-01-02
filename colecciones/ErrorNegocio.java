/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.colecciones;

/**
 *
 * @author Jazna
 */
public class ErrorNegocio extends Exception{
    private final String descripcion;

    public ErrorNegocio(String message) {
        this.descripcion = message;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
}
