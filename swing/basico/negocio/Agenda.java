/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canalyoutube.gui.negocio;

import java.util.ArrayList;

/**
 *
 * @author Jazna
 */
public class Agenda {
    private ArrayList<Persona> contactos;
    
    public Agenda(){
        this.contactos = new ArrayList();
    }
    
    public int totalContactos(){
        return this.contactos.size();
    }
    
    public boolean agregarContacto(Persona nueva){
        if (!this.contactos.contains(nueva)){
            this.contactos.add(nueva);
            return true;
        }
        return false;
    }
    
    public ArrayList<Persona> getContactos(){
        return this.contactos;
    }
}
