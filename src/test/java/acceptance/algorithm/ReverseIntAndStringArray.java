package acceptance.algorithm;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ReverseIntAndStringArray {
  public static void main(String[] args) {
    int[] iArray = new int[]{101, 102, 103, 104};
    String[] sArray = new String[]{"one", "two", "three", "four"};


    System.out.println("Original int array: " + Arrays.toString(iArray));

    ArrayUtils.reverse(iArray);
    System.out.println("Reversed int array: " + Arrays.toString(iArray));


    System.out.println("Original String array: " + Arrays.toString(sArray));
    ArrayUtils.reverse(sArray);
    System.out.println("Reversed String array: " + Arrays.toString(sArray));
  }
}
