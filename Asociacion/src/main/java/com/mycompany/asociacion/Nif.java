
package com.mycompany.asociacion;

public class Nif 
{
    private int dni;
    private char letra;

    public Nif() {
    }

    public Nif(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return (dni +"-"+ letra);
    }
     
    
    
    
}
