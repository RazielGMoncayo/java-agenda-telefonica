package com.generation.ejercicio.informacion;

import java.util.ArrayList;

public class Agenda{

    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private int numContactos = 10;

    public Agenda(int numContactos){
        this.numContactos = numContactos;
    };

    // Herramientas
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html

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



}
