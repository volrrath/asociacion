
package com.mycompany.asociacion;

public class Fecha 
{
    private int dia;
    private int mes;
    private int amo;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int amo) {
        this.dia = dia;
        this.mes = mes;
        this.amo = amo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAmo() {
        return amo;
    }

    public void setAmo(int amo) {
        this.amo = amo;
    }

    @Override
    public String toString() {
        return ( dia + "/" + mes + "/" + amo);
    }
     
    
    
}
