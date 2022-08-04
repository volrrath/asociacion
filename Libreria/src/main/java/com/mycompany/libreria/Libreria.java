
package com.mycompany.libreria;

import java.util.Scanner;

public class Libreria
{

    public static void main(String[] args)
    {        
        Scanner scan = new Scanner(System.in); 
        Metodos metodo= new Metodos();
        int op=0;  
        String pasar, opcion;
                
         do{
            System.out.println("*** Menu Principal ***");
            System.out.println("----------------------");
            System.out.println("1.- Agregar Publicacion ");
            System.out.println("2.- Contar prestados");
            System.out.println("3.- Publicaciones anteriores a fecha especifica");
            System.out.println("4.- Mostrar publicaciones");
            System.out.println("5.- Salir");
             
            do{                  
                System.out.print("ingrese una opcion valida 1/5: ");pasar=scan.next();                
                if(metodo.validad_numero(pasar)==true)
                {
                    op=Integer.parseInt(pasar);
                }else
                {
                    System.out.println("los parametros ingresados no corresponden");
                }                                
            }while(op<0 || op>5);
            
                switch (op)
                    {
                        case 1:
                        {
                            do{
                                String nom;
                                String tipo, estado,año2;
                                int año;

                                System.out.println("");
                                System.out.println("*** Agregar Publicacion ***");
                                System.out.print("Ingrese nombre publicacion: ");
                                nom=scan.next();

                                do{
                                    do{  
                                        System.out.print("Ingrese año publicacion: ");año2=scan.next();                          
                                    }while(metodo.validad_numero(año2)==false);  
                                    año=Integer.parseInt(año2);                                    
                                }while(año<1850 || año>2022);                                   

                                do{
                                    do{        
                                        System.out.print("Tipo publicacion(Periodico o Revista): ");                     
                                        tipo=scan.next();
                                    }while(metodo.validad_letras(tipo)==false);   
                                }while(!"periodico".equalsIgnoreCase(tipo) && !"revista".equalsIgnoreCase(tipo));
                                
                                do{
                                    do{
                                        System.out.print("Estado publicacion(Prestado o vendido): ");
                                        estado=scan.next();
                                    }while(metodo.validad_letras(estado)==false);
                                }while(!"prestado".equalsIgnoreCase(estado) && !"vendido".equalsIgnoreCase(estado));    

                                Publicaciones publi= new Publicaciones(nom, año, tipo, estado);
                                metodo.agregar(publi);
                                
                                    
                                    System.out.println("Para ingresar otra publicacion  presione la tecla S, ");
                                    System.out.print("en caso contrario presione cualquier tecla: ");metodo.validad_letras(opcion=scan.next());
                                    System.out.println("");
                            }while(opcion.equalsIgnoreCase("s"));
                            
                        break;
                        } 

                        case 2:                            
                        {
                            System.out.println("");
                            System.out.println("*** Mostrar cantidad prestados ***");
                            metodo.prestados();
                            System.out.println("");
                        break;
                        } 
                        
                        case 3:
                        {
                            System.out.println("");
                            System.out.println("*** Mostrar Publicaciones anteriores a fecha especifica ***");
                            int comparar;
                            System.out.print("Ingrese año a comparar: ");comparar=scan.nextInt();
                            metodo.año_comparar(comparar);
                            System.out.println("");
                        break;
                        }
                        
                        case 4:
                        {
                            System.out.println("");
                            System.out.println("*** Mostrar Publicaciones ***");
                            metodo.mostrar();
                            System.out.println("");
                        break;
                        }
                                                                     
                        case 5:
                            System.exit(0);                
                    }                   
        }while(op<=5); 
    }
}
