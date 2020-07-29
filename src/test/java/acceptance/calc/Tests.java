package acceptance.calc;

import org.testng.Assert;
import org.testng.annotations.*;

public class Tests extends Calc {

  @BeforeClass
  public void beforeClass(){
    System.out.println("Before Tests.class");
  }
  @AfterClass
  public void afterClass() {
    System.out.println("After Test.class");
  }


  @Test
  public void getSum() {
    Assert.assertEquals(15, plus(7, 8));
  }

  @Test
  public void divisionByZero()  {
   // Addivide(8, 0);
  }

  @Test
  public void getDivide(){
    Assert.assertEquals(20, divide(100,5));
  }

  @Test
  public void getMultiple() {
    Assert.assertEquals(30, times(15, 2));
  }

  @Test
  public void getMinus() {
    Assert.assertEquals(9, minus(11, 2));
  }

  @Test
  public void failSum() {
    Assert.assertNotEquals(0, plus(2,  1) );
  }

  @Test
  public void failMinus() {
    Assert.assertNotEquals(5, minus(1, 6));
  }

}
