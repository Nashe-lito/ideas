package acceptance.algorithm;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class Algorithm {

  // Перевернуть текст
  @Test
  public void test0() {
    String s = "alla";
    String r = new StringBuffer(s).reverse().toString();
    System.out.println(r);

    //ИЛИ
  }

  public static void main(String[] args) {
    String s = "Google";
    System.out.println(t(s));
  }
  public static String t(String inputString){
    int stringLength = inputString.length();
    String result = "";
    for (int i = 0; i < stringLength; i++) {
      result = inputString.charAt(i) + result;
    }
    return result;
  }

  // Проверить, что слово полиндрон (читается одинаково обычно и задом на перед)

  @Test
  public void test1() {
    String s = "alla";
    String r = new StringBuffer(s).reverse().toString();
    System.out.println(r);

    Assert.assertTrue(s.equals(r));
  }

  // Найти и удалить
  @Test
  public void test2() {
    String a = "Google";
  //  String a = ab.toLowerCase();
    char[] myArray = a.toCharArray();

    for (int i=0; i<myArray.length-1; i++) {
      for (int j=i+1; j<myArray.length; j++){
        if (myArray[i] == myArray[j]){
          myArray = ArrayUtils.remove(myArray, j);
         // System.out.println(Arrays.toString(myArray));
        }
      }
    }
    System.out.println(Arrays.toString(myArray));
   // System.out.println((a));
  }

  //Поиск минимального значения элемента в массиве
  @Test
  public void test3() {
    int[] array = new int[] {90, 12, 89, 61, 78, 64, 99, 30, 6, 93, 7};

    int minValue = array[0];
    int minIndex = 0;

    for (int i = 1; i < array.length; i++){
      if(array[i] > minValue){
        minValue = array[i];
        minIndex = i;
      }
    }

    System.out.println("min index is" + minIndex);
    System.out.println("min value is" + minValue);
  }

  //Сортировка пузырьком
  @Test
  public  void test4() {
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

  @Test
  public void testt() {
    int[] a = new int[] {10, 2, 3, 4, 9, 1};

    int minValue = a[0];
    int minIndex = 0;

    for (int i = 1; i < a.length; i++){
      if (a[i] < minIndex){
        minValue = a[i];
        minIndex = i;
      }

    }
    System.out.println(minIndex);
    System.out.println(minValue);

  }
}
