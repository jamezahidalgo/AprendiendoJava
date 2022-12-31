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
public abstract class Figura implements ICalculable{
   private String color;
   
   public Figura(String color){
       this.color = color;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
   
   @Override
    public String toString(){
        return "[" + this.color + "]";
    }
    
    public boolean equals(Figura f){
        return this.color.equalsIgnoreCase(f.color) && this.area() == f.area();
    }
   
}
