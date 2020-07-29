package acceptance.algorithm;

public class Convert {
  public static void main(String[] args) {
    int i = Integer.parseInt("0123");
    System.out.println(i);

    int i2 = Integer.valueOf("0234");
    System.out.println(i2);

    double d = Double.parseDouble("3456.44");
    System.out.println(d);

    float f = Float.parseFloat("789.44");
    System.out.println(f);

    ///////
    String s = String.valueOf("123");
    System.out.println(s);

    String s2 = String.format("%d", 999);
    System.out.println(s2);
  }
}
