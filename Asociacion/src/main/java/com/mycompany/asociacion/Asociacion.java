package com.mycompany.asociacion;
import java.util.Scanner;

public class Asociacion {

    public static void main(String[] args)
    {
       /* ArrayList<Socio> list_socio = new ArrayList<>();
              
        Fecha fechaNac=new Fecha(10,5,1983);
        Fecha fechaAlta=new Fecha(12, 12,2022);
        Nif nif1= new Nif(14632856,'k');
        Socio socio= new Socio("wqe5", fechaAlta, "pedro", "parra", fechaNac, nif1);
        list_socio.add(socio);        
        
        System.out.println(list_socio);*/
        
        Scanner scan = new Scanner(System.in); 
        Metodos metodo= new Metodos();
        int op=0;  
        String pasar, opcion;
                
         do{
            System.out.println(""); 
            System.out.println("*** Menu Principal ***");
            System.out.println("----------------------");
            System.out.println("1.- Agregar Persona ");
            System.out.println("2.- agregar socios");
            System.out.println("3.- Mostrar personas sin asociar");
            System.out.println("4.- Mostrar socios");
            System.out.println("5.- Salir");
             
            do{                  
                System.out.print("ingrese una opcion valida 1/5: ");op=scan.nextInt();                                       
            }while(op<0 || op>5);
            
                switch (op)
                    {
                        case 1:
                        {
                            String nombre,apellido;
                            int dia,mes,amo,num;
                            char dig;
                            System.out.print("Agregar nombre: ");nombre=scan.next();
                            System.out.print("Agregar apellido: ");apellido=scan.next();
                            System.out.print("Agregar dia nacimiento: ");dia=scan.nextInt();
                            System.out.print("Agregar mes naciminto: ");mes=scan.nextInt();
                            System.out.print("Agregar año nacieminto: ");amo=scan.nextInt();
                            System.out.print("Agregar rut: ");num=scan.nextInt();
                            System.out.print("digito verificador: ");dig=scan.next().charAt(0);
                            Nif nuNif=new Nif(dia, dig);
                            Fecha fechaNac=new Fecha(dia, mes, amo);
                            Persona perso=new Persona(nombre, apellido, fechaNac, nuNif);
                            metodo.agregar(perso);
                        break;
                        } 

                        case 2:                            
                        {                
                            metodo.agregar_asociado();
                        break;
                        } 
                        
                        case 3:
                        {
                           metodo.mostrar();
                        break;
                        }
                        
                        case 4:
                        {
                           metodo.mostrar_socio();                           
                        break;
                        }
                                                                     
                        case 5:
                            System.exit(0);                
                    }                   
        }while(op<=5); 
    }
               
    
}

