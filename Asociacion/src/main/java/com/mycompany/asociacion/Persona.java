
package com.mycompany.asociacion;

public class Persona
{
    private String nombre;
    private String apellidos; 
    private Fecha fechaNac; //agregacion
    private Nif nuNif; //composicion

    public Persona() {
    }

    public Persona(String nombre, String apellidos, Fecha fechaNac, Nif nuNif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.nuNif = nuNif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Nif getNuNif() {
        return nuNif;
    }

    public void setNuNif(Nif nuNif) {
        this.nuNif = nuNif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac + ", nuNif=" + nuNif + '}';
    }

   
    
}
