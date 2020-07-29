package acceptance.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestsAlc {
  public static void main(String[] args) {
    int[] array = new int[]{12, 3, 65, 87, 32};
    int[] array2 = new int[]{21, 3, 5, 7, 2};
    int number = 1234567;
    String input = "hello world";
    String string = "tact coA";
    String string2 = "Coa tacT";



    char delChar = 'd';
    String a = "";

    for (int i = 0; i <input.length(); i++){
      if (input.charAt(i) != delChar){
        a +=input.charAt(i);
      }
    }
    System.out.println(input);
    System.out.println(a);
  }


}
