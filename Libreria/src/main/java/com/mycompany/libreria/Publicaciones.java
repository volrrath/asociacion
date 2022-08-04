
package com.mycompany.libreria;

public class Publicaciones
{
    private String nombre;
    private int año_publicacion;
    private String tipo_publicacion;
    private String estado_publicacion;

    public Publicaciones() {
    }

    public Publicaciones(String nombre, int año_publicacion, String tipo_publicacion, String estado_publicacion) {
        this.nombre = nombre;
        this.año_publicacion = año_publicacion;
        this.tipo_publicacion = tipo_publicacion;
        this.estado_publicacion = estado_publicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño_publicacion() {
        return año_publicacion;
    }

    public void setAño_publicacion(int año_publicacion) {
        this.año_publicacion = año_publicacion;
    }

    public String getTipo_publicacion() {
        return tipo_publicacion;
    }

    public void setTipo_publicacion(String tipo_publicacion) {
        this.tipo_publicacion = tipo_publicacion;
    }

    public String getEstado_publicacion() {
        return estado_publicacion;
    }

    public void setEstado_publicacion(String estado_publicacion) {
        this.estado_publicacion = estado_publicacion;
    }

    @Override
    public String toString() {
        return "El nombre publicacion es " + nombre + " y fue emitida el año de " + año_publicacion + ", es de tipo " + tipo_publicacion + ", y su estado actual es " + estado_publicacion;
    }

    
    
}
