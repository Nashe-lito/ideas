package acceptance.algorithm;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[] f = new int[n];
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i < n; i++) {
      f[i] = f[i-1] + f[i - 2];
    }

    for (int i= 0; i < n; i++) {
      System.out.println(f[i]);
    }
  }

  @Test
  public void test() {
    int n0 = 1;
    int n1 = 1;
    int n2;

    System.out.print(n0 + " " + n1 + " ");
    for (int i = 3; i <= 11; i++){
      n2 = n0 + n1;
      System.out.print(n2 + " ");
      n0 = n1;
      n1 = n2;
    }
   // System.out.println();
  }
}
