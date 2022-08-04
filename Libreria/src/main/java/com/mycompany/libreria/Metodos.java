
package com.mycompany.libreria;

import java.util.ArrayList;

public class Metodos
{   
    ArrayList<Publicaciones> lista_publicaciones=new ArrayList<>();
    
    public void agregar(Publicaciones publi)
    {
        lista_publicaciones.add(publi);
    }
    
    public void mostrar()
    {
       if(lista_vacia()==true) 
       {
           System.out.println("Lista vacia");
       }else
       {
           for(int i=0;i<largo_lista();i++)
           {
               System.out.println(lista_publicaciones.get(i));
           }
       }
    }
    
    public void prestados()
    {
        int resultado=0;
        if(lista_vacia()==true) 
       {
           System.out.println("Lista vacia");
       }else
       {
           for(int i=0;i<largo_lista();i++)
           {
               if(lista_publicaciones.get(i).getEstado_publicacion().equalsIgnoreCase("prestado"))
               {
                   resultado=resultado+1;
               }
           }
           System.out.println("La cantidad de publicaciones PRESTADAS es: "+resultado);  
       }       
    }
    
    public void año_comparar(int comparar)
    {
        int resultado=0;
         if(lista_vacia()==true) 
       {
           System.out.println("Lista vacia");
       }else
       {
           for(int i=0;i<largo_lista();i++)
           {
               if(lista_publicaciones.get(i).getAño_publicacion()<comparar)
               {
                   resultado=resultado+1;
               }
           }
           System.out.println("La cantidad de publicaciones con fecha anterior al año "+comparar+" es: "+resultado);  
       }       
    }
    
    //validar que solo se ingresen letras
    public boolean validad_letras(String nombre)
    {
        boolean respuesta=(nombre.matches("[a-zA-Z]*"));
        return respuesta;
    } 
     
    //validar que solo se ingresen numeros
    public boolean validad_numero(String pasar)
    {
        boolean respuesta=(pasar.matches("[0-9]*"));
        return respuesta;
    }  
    
     //entrega el largo del Arraylist
    public int largo_lista()
     {
         int resultado=lista_publicaciones.size();
         return resultado;
     }
     
     //verifica si la lista se encuentra vacia
    public boolean lista_vacia()
     {
         boolean resultado= false;
         if(lista_publicaciones.isEmpty())
         {
             resultado=true;
         }
        return resultado;
     }
    
}
