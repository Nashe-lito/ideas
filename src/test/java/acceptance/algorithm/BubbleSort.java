package acceptance.algorithm;

import org.testng.annotations.Test;

import java.util.Arrays;

public class BubbleSort {

  //Сортировка пузырьком
  //version №1
  public static void main(String[] args) {
    int[] array = new int[] {90, 12, 89, 61, 78, 64, 99, 30, 6, 93, 7};

    printArray(array);

    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      for (int i = 1; i < array.length; i++){
        if (array[i] < array[i - 1]) {
          int temp = array[i];
          array[i] = array[i - 1];
          array[i - 1] = temp;
          isSorted = false;
        }
      }
      printArray(array);
    }
  }
  private static void printArray(int[] array) {
    System.out.println("[");
    for (int i= 0; i < array.length; i++) {
      if (i > 0) {
        System.out.println(",");
      }
      System.out.println(array[i]);
    }
    System.out.println("]");
  }

  //version №2
  //bubble sort
  @Test
  public void test13() {
    int[] a = new int[] {20, 12, 45, 19, 91, 55};
    int[] b = new int[] {-1, 0, 1};
    int[] c = new int[] {-3, -9, -2, -1};

    bubbleSort(a);
    bubbleSort(b);
    bubbleSort(c);

  }

  public static void bubbleSort(int[] numbers) {
    System.out.println(Arrays.toString(numbers));

    for (int i = 0; i<numbers.length; i++){
      for (int j = numbers.length - 1; j>i; j--) {
        if (numbers[j]<numbers[i]){
          swap(numbers, j, j-1);
        }
      }
    }
    System.out.println(Arrays.toString(numbers));
  }

  public static void swap(int[] array, int from, int to) {
    int temp = array[from];
    array[from] = array[to];
    array[to] = temp;
  }

  //version #3
  @Test
  public void testtt() {
    int[] a = new int[] {20, 12, 45, 19, 91, 55};

    boolean isSorted = false;
    int temp;

    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i<a.length - 1; i++){
        if (a[i]>a[i+1]){
          isSorted= false;

          temp = a[i];
          a[i] = a[i+1];
          a[i+1] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }

  //version #4
  @Test
  public void test4() {
    String a = "i love java";
    char[] ch = a.toCharArray();

    boolean isSorted = false;

    while (!isSorted){
      isSorted = true;
      for (int i = 0; i<ch.length - 1; i++){
        if (ch[i] >ch[i +1]){
          isSorted = false;

          char temp = ch[i];
          ch[i] = ch[i+1];
          ch[i+1] = temp;
        }
      }
    }

    String b = new String(ch);
    System.out.println(b);
  }
}
