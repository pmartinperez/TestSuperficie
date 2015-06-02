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
    
    @Test
    public void testCalcularAreaRectangle() {
        System.out.println("calcularAreaRectangle");
        float result;
        Rectangle rectangle= new Rectangle();
        rectangle.setSideLength(2);
        rectangle.setSideHeight(3);
        Superficies.calcularAreaRectangle(rectangle);
        
        
        assertEquals(6, rectangle.getRectangleArea(), 0);
    }

    /**
     * Test of calcularAreaTriangle method, of class Superficies.
     */
   
    @Test
    public void testCalcularAreaTriangle() {
        System.out.println("calcularAreaTriangle");
        float result;
        Triangle triangle= new Triangle();
        triangle.setBaseLength(2);
        triangle.setHeight(3);
        Superficies.calcularAreaTriangle(triangle);
        
        
        assertEquals(3, triangle.getTriangleArea(), 0);
    }

    /**
     * Test of calcularAreaCircle method, of class Superficies.
     */
   
    @Test
    public void testCalcularAreaCircle() {
        System.out.println("calcularAreaCircle");
        float result;
        Circle circle = new Circle();
        circle.setRadius(2);
        Superficies.calcularAreaCircle(circle);
        
        
        assertEquals(12.56, circle.getCircleArea(), 0.5); 
    }
    
}
