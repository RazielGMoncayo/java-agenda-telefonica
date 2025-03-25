package com.generation.ejercicio.informacion;

import java.util.ArrayList;

public class Agenda{
    private static final ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private static int numContactos = 10;

    public Agenda(int numContactos){
        this.numContactos = numContactos;
    }

    // Herramientas
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html

//    añadirContacto(){}
    public static void adContacto(Contacto c){
        if(contactos.size() >= numContactos){
            System.out.println("Has alcanzado el limite de contactos");
            return;
        }else{
            contactos.add(c);
            System.out.println("Contacto agregado: " + c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

//    existeContacto(){}
    public void existeContacto(){

    }

//    listarContactos(){}
    public static void listarContactos(){
        for(Contacto c : contactos){
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }


//
//    buscaContacto(String nombre){}
//
//    eliminarContacto(Contacto c){}
//
//    modificarTelefono(String nombre, String apellido, String nuevoTelefono){}
//
//    agendaLlena(){}
//
//    espacioLibres(){}


}

