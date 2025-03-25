package com.generation.ejercicio.informacion;

import java.util.ArrayList;

public class Agenda{

    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private int numContactos;

    public Agenda(int numContactos) {
        this.numContactos = numContactos;
    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public int getNumContactos() {
        return numContactos;
    }

    public void setNumContactos(int numContactos) {
        this.numContactos = numContactos;
    }

    public Agenda(int numContactos){
        this.numContactos = numContactos;
    };

    // Herramientas
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html

//    añadirContacto(){}
    public static void adContacto(Contacto c){
        if(contactos.size() >= numContactos){
            System.out.println("Has alcanzado el limite de contactos");
            return;
        }else{
            contactos.add(c);
            System.out.println(c);
        }

    }

//
//    existeContacto(){}
//    public void existeContacto(){
//
//    }
//
//    listarContactos(){}
    public void listarContactos(){
        for(Contacto c : contactos){
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
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
