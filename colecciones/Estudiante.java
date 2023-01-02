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
public class Estudiante {

    private String nombre;
    private float nota;

    public Estudiante() {
    }

    public Estudiante(String nombre, float nota) throws ErrorNegocio {
        this.setNombre(nombre);
        this.setNota(nota);
    }

    public String getNombre() {
        return this.nombre;
    }

    public float getNota() {
        return this.nota;
    }

    public void setNombre(String nombre) throws ErrorNegocio {
        if (nombre.length() >= 3) {
            this.nombre = nombre;
        }
        else{
            throw new ErrorNegocio("Nombre no cumple con la regla. Debe tener al menos 3 caracteres");
        }
    }

    public void setNota(float nota) throws ErrorNegocio {
        if (nota >= 1 && nota <= 7){
            this.nota = nota;
        }
        else{
            throw new ErrorNegocio("Nota no cumple con la regla. Debe estar dentro del rango 1 y 7");
        }
    }
    
    public boolean equals(Object o){
        return o instanceof Estudiante && this.nombre.equalsIgnoreCase(((Estudiante) o).nombre);
    }

}
