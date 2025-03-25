package com.generation.ejercicio.informacion;

import java.util.ArrayList;
import java.util.Comparator;

public class Agenda extends Contacto{

    public Agenda(String apellido, String name, int telefono) {
        super(apellido, name, telefono);
    }

    // Herramientas
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html

    añadirContacto(){}

    existeContacto(){}

    listarContactos(){}

    buscaContacto(String nombre){}

    eliminarContacto(Contacto c){
        public boolean eliminarContacto(Contacto c) {
            if (contactos.removeIf(contacto ->
                    contacto.getName().equalsIgnoreCase(c.getName()) &&
                            contacto.getApellido().equalsIgnoreCase(c.getApellido()))) {
                System.out.println("Contacto eliminado.");
                return true;
            }
            System.out.println("El contacto no existe en la agenda.");
            return false;
        }
    }

    modificarTelefono(String nombre, String apellido, String nuevoTelefono){}

    agendaLlena(){}

    espacioLibres(){}
}
