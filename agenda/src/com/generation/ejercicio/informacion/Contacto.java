package com.generation.ejercicio.informacion;

public class Contacto {
    protected String name;
    protected String apellido;
    protected long telefono;

    public Contacto(String apellido, String name, long telefono) {
        this.apellido = apellido;
        this.name = name;
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
