/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.gui.negocio;

/**
 *
 * @author Jazna
 */
public class ErrorNegocio extends Exception {
    private String descripcion;
    
    public ErrorNegocio(String d){
        this.descripcion = d;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
