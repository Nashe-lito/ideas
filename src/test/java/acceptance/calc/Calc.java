package acceptance.calc;

public class Calc {
  public double plus(double a, double b) {
    return a + b;
  }

  public double minus(double a, double b) {
    return a - b;
  }

  public double divide(double a, double b) {
    if (b==0){
      throw new IllegalArgumentException("Cannot divide by 0!");
    }
    return a / b;
  }

  public double times(double a, double b) {
    return a * b;
  }
}
