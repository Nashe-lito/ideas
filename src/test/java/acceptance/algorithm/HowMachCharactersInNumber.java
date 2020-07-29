package acceptance.algorithm;

public class HowMachCharactersInNumber {
  public static void main(String[] args) {
    int a = 1234561;

    int length = String.valueOf(a).length();
    System.out.println(length);

    // OR
    int length2 = (int)(Math.log10(a) +1 );
    System.out.println(length2);
  }
}
