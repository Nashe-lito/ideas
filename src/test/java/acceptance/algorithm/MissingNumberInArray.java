package acceptance.algorithm;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumberInArray {
  public static void main(String[] args) {
    printMissingNumber(new int[] {1, 2, 3, 4, 6}, 6);
    printMissingNumber(new int[] {1, 2, 3, 4, 6, 9, 8}, 10);
    int[] array = new int[] {1, 2, 3, 5};
    int missing = getMissingNumber(array, 5);

    System.out.printf("Missing number in array %s is %d %n", Arrays.toString(array), missing);
  }

  private static void findMissingNumber(int[] number){
    for (int i = 0; i < number.length; i++){
      int j = i + 1;
      int difference = number[j] - number[i];
      if (difference != 1){
        int missingNum = number[i] + 1;

        for (int k = difference; k > 1; k++){
          System.out.println("Miss num: " + missingNum);
          missingNum++;
        }
      }
    }
  }

  private static void printMissingNumber(int[] numbers, int count){
    int missingCount = count - numbers.length;
    BitSet bitSet = new BitSet(count);

    for (int number : numbers){
      bitSet.set(number - 1);
    }
    System.out.printf(Arrays.toString(numbers), count);
    int lastMissingIndex = 0;

    for (int i = 0; i < missingCount; i++){
      lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
      System.out.println(++lastMissingIndex);
    }
  }

  private static int getMissingNumber(int[] numbers, int totalCount) {
    int expectedSum = totalCount * ((totalCount +1)/2);
    int actualSum = 0;

    for (int i : numbers){
      actualSum += i;
    }
    return expectedSum - actualSum;
  }
}
