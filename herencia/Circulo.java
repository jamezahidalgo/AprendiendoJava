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
public class Circulo extends Figura{
    private float radio;
    
    public Circulo(String color){
        super(color);
    }
    
    public Circulo(String color, float radio){
        super(color);
        this.setRadio(radio);
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        if (radio > 0){
            this.radio = radio;
        }
    }
    
    @Override
    public String toString(){
        return super.toString() + "; {" + this.radio + "}";
    }
    
    public float area(){
        return (float) Math.PI*this.radio*this.radio;
    }
    
}
