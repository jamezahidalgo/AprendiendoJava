/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.colecciones;

import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class Curso {
    private int codigo;
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiantes = new ArrayList();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    
    /**
     * Agrega un nuevo estudiante al curso
     * @param nuevo, estudiante que será agregado al curso
     * @return valor de verdad para ver si el estudiante logró o no ser incorporad
     */
    public boolean agregarEstudiante(Estudiante nuevo){
        if (!this.estudiantes.contains(nuevo)){
            this.estudiantes.add(nuevo);
            return true;
        }        
        return false;
    }
    
    /**
     * Bonfica la nota de todos los estudiantes en el % indicado
     * @param porcentajeBonificacion, % de bonificación de la nota
     * @throws ErrorNegocio, cuando la nota no cumpla con la regla establecida
     */
    public void bonificarNota(float porcentajeBonificacion) throws ErrorNegocio{
        for(Estudiante alguien : this.estudiantes){
            float notaActual = alguien.getNota();
            float notaNueva = Math.min(7, notaActual*(1 + porcentajeBonificacion));
            alguien.setNota(notaNueva);
        }
    }
    
    /**
     * Elimina los estudiantes con nota inferior al límite
     * @param limiteNota, límite de nota para eliminar al estudiante
     * @return cantidad de estudiantes eliminados
     */
    public int eliminarEstudiantes(float limiteNota){
        ArrayList<Estudiante> victimas = new ArrayList();
        for(Estudiante alguien : this.estudiantes){
            if (alguien.getNota() < limiteNota){
                victimas.add(alguien);
            }
        }
        this.estudiantes.removeAll(victimas);
        return victimas.size();
    }
    
    
    
}
