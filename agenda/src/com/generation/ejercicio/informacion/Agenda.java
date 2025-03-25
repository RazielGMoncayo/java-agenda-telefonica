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
    public static void existeContacto( String apellido, String nombre){
        boolean encontrado = false;
        for (Contacto c : contactos){
            if (c.getName().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                encontrado = true;
                break;
            }
        }
        System.out.println(encontrado ? "Sí existe el contacto" : "No existe el contacto");
    }

//    listarContactos(){}
    public static void listarContactos(){
        for(Contacto c : contactos){
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

//    buscaContacto(String nombre){}
    // buscar contacto nombre y apellido
public static void buscaContacto(String nombre, String apellido){
    boolean encontrado = false;
    Contacto contactoEncontrado = null;

    for (Contacto c : contactos){
        if (c.getName().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
            encontrado = true;
            contactoEncontrado = c;
            break;
        }
    }
    System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
}
    // nombre
    public static void buscaContactoNombre(String nombre){
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos){
            if (c.getName().equalsIgnoreCase(nombre)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }
    // apellido
    public static void buscaContactoApellido(String apellido){
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos){
            if (c.getApellido().equalsIgnoreCase(apellido)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }
    // numero
    public static void buscaContactoNumero(int numero){
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos){
            if (c.getTelefono() == numero) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }

//    eliminarContacto(Contacto c){} // luis miguel


//    modificarTelefono(String nombre, String apellido, String nuevoTelefono){}
    public static void modificarTelefono(String nombre, String apellido, int nuevoTelefono){
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos){
            if (c.getName().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                c.setTelefono(nuevoTelefono);
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? "Telefono actualizado: " + contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }

    // moficar nombre y apellido por numero
    public static void modificarNombreCompleto( int telefono, String nuevoNombre, String nuevoApellido){
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos){
            if (c.getTelefono() == telefono ) {
                c.setName(nuevoNombre);
                c.setApellido(nuevoApellido);
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? "Nombre actualizado: " + contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }
//
//    agendaLlena(){}

//
//    espacioLibres(){}



}

