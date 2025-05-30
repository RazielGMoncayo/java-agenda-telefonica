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
//            System.out.println("Contacto agregado: " + c.getApellido() + " " + c.getName() + " " + c.getTelefono());
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
    public Contacto buscaContacto(String nombre, String apellido) {
        String nombreBusqueda = nombre.trim();
        String apellidoBusqueda = apellido.trim();

        for (Contacto c : contactos) {
            if (c.getName().equalsIgnoreCase(nombreBusqueda) && c.getApellido().equalsIgnoreCase(apellidoBusqueda)) {
                return c;
            }
        }
        return null;
    }

    // apellido
    public Contacto buscaContactoNombreApellido(String nombre, String apellido) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getApellido().equalsIgnoreCase(apellido) && c.getName().equalsIgnoreCase(nombre)) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }
        if (encontrado) {

            return contactoEncontrado;
        }else {
            System.out.println("No existe el contacto");
            return null;
        }
    }

    // numero
    public Contacto buscaContactoNumero(long numero) {
        boolean encontrado = false;
        Contacto contactoEncontrado = null;

        for (Contacto c : contactos) {
            if (c.getTelefono() == numero) {
                encontrado = true;
                contactoEncontrado = c;
                break;
            }
        }


        if (encontrado) {
            return contactoEncontrado;
        }else {
            System.out.println("No existe el contacto");
            return null;
        }
    }
//
    public boolean eliminarContacto(Contacto contacto){
        return contactos.remove(contacto);
    }

//    modificarContacto(String nombre, String apellido, String nuevoTelefono){}
    public static void modificarTelefono(Contacto c, String nuevoNombre, String nuevoApellido, long nuevoTelefono) {
        c.setApellido(nuevoApellido);
        c.setName(nuevoNombre);
        c.setTelefono(nuevoTelefono);
    }

// Obtener contactos
    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
}