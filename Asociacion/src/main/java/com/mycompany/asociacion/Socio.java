
package com.mycompany.asociacion;

public class Socio extends Persona //herencia
{
    private String codigoSoc;
    private Fecha fechaAlta;

    public Socio() {
    }

    public Socio(String codigoSoc, Fecha fechaAlta) {
        this.codigoSoc = codigoSoc;
        this.fechaAlta = fechaAlta;
    }

    public Socio(String codigoSoc, Fecha fechaAlta, String nombre, String apellidos, Fecha fechaNac, Nif nuNif) {
        super(nombre, apellidos, fechaNac, nuNif);
        this.codigoSoc = codigoSoc;
        this.fechaAlta = fechaAlta;
    }    

    public String getCodigoSoc() {
        return codigoSoc;
    }

    public void setCodigoSoc(String codigoSoc) {
        this.codigoSoc = codigoSoc;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return ("codigo Socio: " + codigoSoc +" Fecha Alta: " + fechaAlta +" Nombre: "+getNombre()+" Apellido: "+getApellidos()+" Fecha nacimiento: "+getFechaNac()+" Nif: "+getNuNif());
    }

    
    
    
   
}
