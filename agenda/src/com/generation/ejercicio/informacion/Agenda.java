package com.generation.ejercicio.informacion;

import java.util.ArrayList;

public class Agenda{

    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private int numContactos;
    private int numContactosLibres;

    public Agenda(int numContactos){
        this.numContactos = numContactos;
    }

    public void adContacto(Contacto c){
        if(contactos.size() >= numContactos){
            System.out.println("Has alcanzado el limite de contactos");
            return;
        }else{
            contactos.add(c);
        }
    }

    public void listarContactos(){
        for(Contacto c : contactos){
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

    public ArrayList<Contacto> getContactos(){
        return contactos;
    }

}
