package com.generation.ejercicio.informacion;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
    private int numContactos;

    public Agenda(int numContactos) {
        this.numContactos = numContactos;
    }

    //    añadirContacto(){}
    public void adContacto(Contacto c) {
        if (contactos.size() >= numContactos) {
            System.out.println("Has alcanzado el limite de contactos");
            return;
        } else {
            contactos.add(c);
            System.out.println("Contacto agregado: " + c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

    //    existeContacto(){}
    public boolean existeContacto(String apellido, String nombre) {
        boolean encontrado = false;
        for (Contacto c : contactos) {
            if (c.getName().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    //    listarContactos(){}
    public void listarContactos() {
        for (Contacto c : contactos) {
            System.out.println(c.getApellido() + " " + c.getName() + " " + c.getTelefono());
        }
    }

    //    buscaContacto(String nombre){}
    // buscar contacto nombre y apellido
    public void buscaContacto(String nombre, String apellido) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getName().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }

    // nombre
    public void buscaContactoNombre(String nombre) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getName().equalsIgnoreCase(nombre)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }

    // apellido
    public void buscaContactoApellido(String apellido) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getApellido().equalsIgnoreCase(apellido)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }

    // numero
    public void buscaContactoNumero(int numero) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getTelefono() == numero) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        System.out.println(encontrado ? contactoEncontrado.getApellido() + " " + contactoEncontrado.getName() + " " + contactoEncontrado.getTelefono() : "No existe el contacto");
    }
//
//    eliminarContacto(Contacto c){} // luis miguel

    //
//    modificarTelefono(String nombre, String apellido, String nuevoTelefono){}
    public static void modificarNombre() {

    }

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}