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
public class SuperficieAreaTest {
   private float squareArea;
   private float sideLength;
 
   private Superficies superficies;

   @Before
   public void initialize() {
      superficies = new Superficies();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public SuperficieAreaTest(
      float sideLength,float squareArea) {
      this.sideLength = sideLength;
      this.squareArea = squareArea;
   }

   @Parameterized.Parameters
   public static Collection squareNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, 4 },
         { 6, 36 },
         { 5, 25 },
         { 3, 9 },
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testAreaSquare() {
      System.out.println("Parameterized Number is : " + sideLength);
      Square square = new Square();
      square.setSideLength(sideLength);
      Superficies.calcularAreaSquare(square);
      assertEquals(squareArea, square.getSquareArea(),0.0);
   }
}