package com.generation.ejercicio.informacion;

import java.util.ArrayList;

public class Agenda extends Contacto {
    private ArrayList<Contacto> contactos;

    public Agenda(String apellido, String name, int telefono) {
        super(apellido, name, telefono);
        this.contactos = new ArrayList<>();
    }

    // Herramientas
    // https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayList.html

    void añadirContacto() {
    }

    void existeContacto() {
    }

    void listarContactos() {
    }

    public void buscaContacto(String nombre) {
        boolean encontrado = false;
        for (Contacto contacto : contactos) {
            if (contacto.getName().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado:");
                System.out.println("Nombre: " + contacto.getName());
                System.out.println("Apellido: " + contacto.getApellido());
                System.out.println("Teléfono: " + contacto.getTelefono());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún contacto con el nombre: " + nombre);
        }
    }

    void eliminarContacto(Contacto c) {
    }

    void modificarTelefono(String nombre, String apellido, String nuevoTelefono) {
    }

    void agendaLlena() {
    }

    void espacioLibres() {
    }
}