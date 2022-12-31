/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.herencia;

/**
 *
 * @author Jazna
 */
public class Cuadrado extends Figura {
    private float lado;
    
    public Cuadrado(String color){
        super(color);
    }
    
    public Cuadrado(String color, float lado){
        super(color);
        this.setLado(lado);
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        if (lado > 0){
            this.lado = lado;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + ";[" + this.lado + "]";
    }
    
    @Override
    public float area(){
        return this.lado*this.lado;
    }
    
}
