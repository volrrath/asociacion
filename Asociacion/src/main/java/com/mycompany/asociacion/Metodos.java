/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asociacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos 
{
    ArrayList<Persona> nuevo_per= new ArrayList<>();
    ArrayList<Socio> nuevo_soc= new ArrayList<>();
    Scanner sca=new Scanner(System.in);
    
    public void agregar(Persona perso)
    {
       nuevo_per.add(perso);
    }
    
    
    public void agregar_asociado()            
    {
        if(nuevo_per.isEmpty())
        {
            System.out.println("No se puede crear asociado... No hay personas");
        }else
        {
             mostrar();
             int indice;
             System.out.print("ingese indice: ");indice=sca.nextInt();
             
                            String codigo;
                            int dia, mes, amo;
                            System.out.print("codigo: ");codigo=sca.next();
                            System.out.print("dia Alta: ");dia=sca.nextInt();
                            System.out.print("mes Alta: ");mes=sca.nextInt();
                            System.out.print("año Alta: ");amo=sca.nextInt();
                            Fecha fechaAlt=new Fecha(dia, mes, amo);
                            Socio so=new Socio(codigo, fechaAlt, nuevo_per.get(indice).getNombre(), nuevo_per.get(indice).getApellidos(), nuevo_per.get(indice).getFechaNac(), nuevo_per.get(indice).getNuNif());
                            nuevo_soc.add(so);
                            nuevo_per.remove(indice);
        }                    
    }
    
    
    public void mostrar()
    {
        for(int i=0;i<nuevo_per.size();i++)
        {
            System.out.println(i+"-. "+nuevo_per);
        }
    }
    
     public void mostrar_socio()
    {
        for(int i=0;i<nuevo_soc.size();i++)
        {
            System.out.print(nuevo_soc);
        }
    }
    
}
