/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.org.Triangulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adriano
 */
public class TrianguloTest {
    
    public TrianguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     /**
     * Test of tipo method, of class Triangulo.
     */
    @Test
    public void testTipo() {
        System.out.println("tipo");
        int lado1 = 1;
        int lado2 = 1;
        int lado3 = 1;
        Triangulo instance = new Triangulo();
        String expResult = "Triangulo Equilatero";
        String result = instance.tipo(lado1, lado2, lado3);
        assertEquals(expResult, result);
       
        lado1 = 13;
        lado2 = 13;
        lado3 = 9;
        expResult = "Triangulo Isosceles";
        String result1 = Triangulo.tipo(lado1, lado2, lado3);
        assertEquals(expResult, result1);
        
        lado1 = 10;
        lado2 = 8;
        lado3 = 9;
        expResult = "Triangulo Escaleno";
        String result2 = Triangulo.tipo(lado1, lado2, lado3);
        assertEquals(expResult, result2);
                
        lado1 = 4;
        lado2 = 3;
        lado3 = 20;
        expResult = "Nao e um Triangulo";
        String result3 = Triangulo.tipo(lado1, lado2, lado3);
        assertEquals(expResult, result3);
    }
    
}
 