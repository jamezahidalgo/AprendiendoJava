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
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) throws ErrorNegocio  {
        this.nombre = nombre;
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ErrorNegocio {
        if (edad > 0){
            this.edad = edad;
        }
        else{
            throw new ErrorNegocio("Edad no cumple la regla de negocio");
        }
    }
    
    @Override
    public boolean equals(Object p){
        if (p instanceof Persona){
            return this.nombre.equalsIgnoreCase(((Persona) p).nombre);
        }
        return false;
    }    
}
