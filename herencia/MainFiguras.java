/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.herencia;

import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class MainFiguras {
    public static void main(String[] args) {
        ArrayList<Figura> coleccion = new ArrayList();
        coleccion.add(new Circulo("azul", (float) 45.6));
        coleccion.add(new Circulo("gris", (float) 25.6));
        coleccion.add(new Cuadrado("rojo", (float) 29));
        
        for(Figura f : coleccion){
            System.out.println(f);
            if (f instanceof Circulo){
                Circulo c = (Circulo) f;
                System.out.println("Radio del circulo " + c.getRadio());
            }
            if (f instanceof Cuadrado){
                Cuadrado c = (Cuadrado) f;
                System.out.println("Lado del cuadrado " + c.getLado());
            }        
            System.out.println("Area de la figura " + f.area());
        }
    }
}
