/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gerar
 */
public class PilaTest {
    
    /**
     * Test of afegir method, of class Pila.
     * Afegir quan esta a 0 
     * Resultat esperat: correcte
     */
    @Test
    public void testAfegir() {
        System.out.println("afegir");
        int el = 1;
        Pila p = new Pila();
        int result = p.afegir(el);
        assertEquals(1, result);
     
    }
    
    /**
     * Test of afegir method, of class Pila.
     * Afegir quan esta amb negatius 
     * Resultat esperat: 0
     */
    @Test
    public void testAfegirNegatiu() {
        System.out.println("afegir amb negatius");
        int el = -1;
        Pila p = new Pila();
        int result = p.afegir(el);
        assertEquals(0, result);
     
    }
    
    /**
     * Test of afegir method, of class Pila.
     * Afegir fins al maxim
     * Resultat esperat: correcte
     */
    @Test
    public void testAfegirMaxim() {
        System.out.println("afegir fins al maxim");
        int el = 100;
        Pila p = new Pila();
        int result = p.afegir(el);
        assertEquals(100, result);
     
    }
    
    /**
     * Test of afegir method, of class Pila.
     * Afegir quan esta superior al maxim, en aquest cas 100 
     * Resultat esperat: 0
     */
    @Test
    public void testAfegirSuperiorMaxim() {
        System.out.println("afegir superior maxim");
        int el = 101;
        Pila p = new Pila();
        int result = p.afegir(el);
        assertEquals(0, result);
     
    }
    
    /**
     * Test of afegir method, of class Pila.
     * Afegir quan esta al mig
     * Resultat esperat: correcte
     */
    @Test
    public void testAfegirMig() {
        System.out.println("afegir al mig");
        int el = 50;
        Pila p = new Pila();
        int result = p.afegir(el);
        assertEquals(50, result);
     
    }
    

    /**
     * Test of treure method, of class Pila.
     * Treure quan es supèrior a 1
     * Resultat:Correcte
     */
    @Test
    public void testTreure() {
        System.out.println("treure");
        Pila p = new Pila();
        int expResult = 0;
        int result = p.treure();
        assertEquals(expResult, result);

    }
    
     /**
     * Test of treure method, of class Pila.
     * Treure quan ja esta buit
     * Resultat: -1
     */
    @Test
    public void testTreureBuit() {
        System.out.println("treure quan ja esta buit");
        Pila p = new Pila();
        int result = p.treure();
        assertEquals(-1, result);

    }
    
    
}
