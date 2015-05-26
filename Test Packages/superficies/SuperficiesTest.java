/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Patripon
 */
public class SuperficiesTest {
    
    public SuperficiesTest() {
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
     * Test of main method, of class Superficies.
     */
    @Ignore
    @Test
    public void testMain() {
        
    }

    /**
     * Test of calcularAreaSquare method, of class Superficies.
     */
    @Test
    public void testCalcularAreaSquare() {
        System.out.println("calcularAreaSquare");
        float result;
        Square square = new Square();
        square.setSideLength(2);
        Superficies.calcularAreaSquare(square);
        
        Square square2 = new Square();
        square.setSquareArea(4);
        
        //NO FUNCIONA el metodo assertEquals con objetos
        //assertEquals("", square, square2);
        assertEquals(4, square.getSquareArea(), 0);
        
        
    }

    /**
     * Test of calcularAreaRectangle method, of class Superficies.
     */
    @Ignore
    @Test
    public void testCalcularAreaRectangle() {
        System.out.println("calcularAreaRectangle");
        Rectangle rectangle = null;
        Superficies.calcularAreaRectangle(rectangle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularAreaTriangle method, of class Superficies.
     */
    @Ignore
    @Test
    public void testCalcularAreaTriangle() {
        System.out.println("calcularAreaTriangle");
        Triangle triangle = null;
        Superficies.calcularAreaTriangle(triangle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularAreaCircle method, of class Superficies.
     */
    @Ignore
    @Test
    public void testCalcularAreaCircle() {
        System.out.println("calcularAreaCircle");
        Circle circle = null;
        Superficies.calcularAreaCircle(circle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
