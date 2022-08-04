/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.libreria;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Volrrath
 */
public class MetodosIT {
    
    public MetodosIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of agregar method, of class Metodos.
     */
    @Test
    public void testAgregar() {
        System.out.println("agregar");
        Publicaciones publi = null;
        Metodos instance = new Metodos();
        instance.agregar(publi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrar method, of class Metodos.
     */
    @Test
    public void testMostrar() {
        System.out.println("mostrar");
        Metodos instance = new Metodos();
        instance.mostrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of prestados method, of class Metodos.
     */
    @Test
    public void testPrestados() {
        System.out.println("prestados");
        Metodos instance = new Metodos();
        instance.prestados();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of año_comparar method, of class Metodos.
     */
    @Test
    public void testAño_comparar() {
        System.out.println("a\u00f1o_comparar");
        int comparar = 0;
        Metodos instance = new Metodos();
        instance.año_comparar(comparar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validad_letras method, of class Metodos.
     */
    @Test
    public void testValidad_letras() {
        System.out.println("validad_letras");
        String nombre = "";
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.validad_letras(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validad_numero method, of class Metodos.
     */
    @Test
    public void testValidad_numero() {
        System.out.println("validad_numero");
        String pasar = "";
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.validad_numero(pasar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of largo_lista method, of class Metodos.
     */
    @Test
    public void testLargo_lista() {
        System.out.println("largo_lista");
        Metodos instance = new Metodos();
        int expResult = 0;
        int result = instance.largo_lista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lista_vacia method, of class Metodos.
     */
    @Test
    public void testLista_vacia() {
        System.out.println("lista_vacia");
        Metodos instance = new Metodos();
        boolean expResult = false;
        boolean result = instance.lista_vacia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
