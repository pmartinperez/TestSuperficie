package superficies;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SuperficiesRectangleTest {
   private float rectangleArea;
   private float sideLength;
   private float sideHeight;
 
   private Superficies superficies;

   @Before
   public void initialize() {
      superficies = new Superficies();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public SuperficiesRectangleTest(
      float sideLength,float sideHeight,float squareArea) {
      this.sideLength = sideLength;
      this.sideHeight = sideHeight;
      this.rectangleArea = squareArea;
   }

   @Parameterized.Parameters
   public static Collection rectangleNumbers() {
      return Arrays.asList(new Object[][] {
         { 2,3, 6 },
         { 6,5, 30 },
         { 5,4, 20 },
         { 3,3, 9 },
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testAreaRectangle() {
      System.out.println("Parameterized Number is : " + sideLength + " " + sideHeight);
      Rectangle rectangle = new Rectangle();
      rectangle.setSideLength(sideLength);
      rectangle.setSideHeight(sideHeight);
      Superficies.calcularAreaRectangle(rectangle);
      assertEquals(rectangleArea, rectangle.getRectangleArea(),0.0);
   }
}