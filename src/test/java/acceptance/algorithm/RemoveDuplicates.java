package acceptance.algorithm;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

  // remove duplicates from ArrayList
  @Test
  public void test() {
    List<String> duplicateList = (List<String>) Arrays.asList("Android", "IOS", "Windows", "Android");

    System.out.println("size of ArrayList with duplicates: " +duplicateList.size());
    System.out.println("ArrayList with duplicates: " + duplicateList);

    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(duplicateList);
    List<String> listWithoutDuplicates = new ArrayList<>(linkedHashSet);

    System.out.println("size of ArrayList without duplicates: " + linkedHashSet.size());
    System.out.println("ArrayList after removing duplicates in same order: " + listWithoutDuplicates);
  }

  //remove duplicates from integer array without Collection

  public static void main(String[] args) {
   int[][] test = new int[][] {
           {1, 1, 2, 2, 3, 4, 5},
           {1, 1, 1, 1, 1, 1, 1},
           {1, 2, 3, 4, 5, 6, 7},
           {1, 2, 1, 1, 1, 1, 1},
   };

   for (int[] input: test) {
     System.out.println("Array with duplicates: " + Arrays.toString(input));
    System.out.println("Array after removing duplicates" + Arrays.toString(removeDuplicates(input)));
   }
  }

  public static int[] removeDuplicates (int[] numberWithoutDuplicates) {
    Arrays.sort(numberWithoutDuplicates);
    int[] result = new int[numberWithoutDuplicates.length];
    int previous = numberWithoutDuplicates[0];
    result[0] = previous;

    for (int i = 0; i < numberWithoutDuplicates.length; i++) {
      int ch = numberWithoutDuplicates[i];

      if (previous != ch) {
        result[i] = ch;
      }
      previous = ch;
    }
    return result;
  }

  @Test
  public void test3() {

  }
}
