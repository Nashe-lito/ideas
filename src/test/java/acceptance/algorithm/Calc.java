package acceptance.algorithm;

import org.apache.commons.math3.exception.ZeroException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calc {
  public double result(double a, double b, String op) throws ArithmeticException {
    if ("+".equals(op)) {
      return a + b;
    } else if ("-".equals(op)) {
      return a - b;
    } else if ("/".equals(op)) {
      if (b == 0) {
        throw new ArithmeticException();
      }
      return a / b;
    } else if ("*".equals(op)) {
      return a * b;
    }
    return a + b;
  }


  @Test
  public void resultPlus(){
    Calc calc = new Calc();
    double result = calc.result(2,3, "+");
    Assert.assertEquals(5, result);
  }

  @Test
  public void resultMinus(){
    Calc calc = new Calc();
    double res = calc.result(5, 4, "-");
    Assert.assertEquals(1, res);
  }

  @Test
  public void resultTimes(){
    Calc calc = new Calc();
    double res = calc.result(4,5,"*");
    Assert.assertEquals(20, res);
    }

    @Test
  public void resultDivisionByZero() {
    Calc calc = new Calc();
    double res = calc.result(20, 0, "/");
    Assert.assertEquals(20, res);
    }

    @Test
  public void resultDivision() {
    Calc calc = new Calc();
    double res = calc.result(20, 5, "/");
    Assert.assertEquals(4, res);
    }
}
