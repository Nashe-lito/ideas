package acceptance.linked;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.Test;
import org.w3c.dom.Node;

import java.util.*;
import java.util.regex.Pattern;

public class Test11 {

  @Test
  public void test1() {
    int[] array = new int[]{1, 2, 3, 4, 5};

    for (int i=0; i<array.length/2; i++){
      int temp = array[i];
      array[i] = array[array.length - 1 - i];
      array[array.length - 1 - i] = temp;
    }

    for (int i= 0; i<array.length; i++){
      System.out.println(array[i]);
    }
  }

  @Test
  public void test2() {
    String input = "I love java";
    String reverse = new StringBuffer(input).reverse().toString();
    System.out.println(reverse);
  }

  @Test
  public void test3(){
    int[] array = new int[] {43, 54, 23, 76, 12, 53, 78};
    int maxValue = array[0];
    int maxIndex = 0;

    int minValue = array[0];
    int minIndex = 0;

    for (int i=0; i<array.length; i++){
      if (array[i]<minValue){
        minValue = array[i];
        minIndex = i;
      } else if(array[i]>maxValue){
        maxValue = array[i];
        maxIndex = i;
      }
    }

    System.out.println(maxValue);
    System.out.println(maxIndex);

    System.out.println("________");

    System.out.println(minValue);
    System.out.println(minIndex);
  }

 @Test
 public void test4(){
    String input = "hello";

    if (uniqueCh(input)){
      System.out.println("All unique: " + input);
    } else {
      System.out.println("Duplicate in: " +input);
    }
  }

  public boolean uniqueCh(String s){
    for (int i = 0; i<s.length(); i++){
      for (int j = i+1; j<s.length(); j++){
        if (s.charAt(i) == s.charAt(j)){
          return false;
        }
      }
    } return true;
  }

  @Test
  public void test5() {
    String input = "qqwweertyuio";
    System.out.println(character(input));
    System.out.println(character1(input));

  }
   public static Character character(String s){
     int[] found = new int[256];
     char[] ch = s.toCharArray();
    for (int i = 0; i<ch.length; i++){
      found[ch[i]]++;
    }

    for (int i = 0; i<ch.length; i++){
      if (found[ch[i]] == 1){
        return ch[i];
      }
    }
     return null;
  }

  public static Character character1(String str){
    char[] ch = str.toCharArray();
    for (int i = 0; i<str.length(); i++){
      int lastIndex = str.lastIndexOf(ch[i]);
      if (lastIndex == str.indexOf(ch[i])){
        return ch[i];
      }
    }
    return null;
  }

  @Test
  public void test6() {
    System.out.println("Programming is");
    Scanner reader = new Scanner(System.in);

    String input = reader.nextLine();
    char[] ch = input.toCharArray();

    int count = 0;

    for (char c : ch) {
      switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
          count++;
          break;
        default:
      }
    }

    System.out.println("Number of vowels is Stging [" + input + "] is: " + count);
  }

  @Test
  public void test7() {
    String input = "Programming";
    int m = 0;
    char[] ch = input.toCharArray();
    for (char c : ch) {
      if (Pattern.matches("m", Character.toString(c))){
        m++;
      }
    }
    System.out.println(m);
    }

  @Test
  public void test8() {
    String input = "Programming";
    int m = 0;
    for (int i = 0; i<input.length(); i++) {
      if (input.charAt(i) == 'm'){
        m++;
      }
    }
    System.out.println(m);
  }

  @Test
  public void test9() {
    String input = "abc";
    permutation("",input);
  }

/*  public static void permutation(String input){
    permutation("", input);
  }*/

  public static void permutation(String perm, String word){
    if (word.isEmpty()){
      System.out.println(perm + word);
    } else  {
      for (int i = 0; i<word.length(); i++){
        permutation(perm + word.charAt(i), word.substring(0,i)
                + word.substring(i+ 1, word.length()));
      }
    }
  }


  public static void main(String args[]) {
    String str = "Programming";
    int vowel = 0;
    int consonants = 0;
    char[] charArr = str.toCharArray();
    for (char c : charArr) {
      if (Pattern.matches("[aeiou]", Character.toString(c)))
        vowel++;
      else {
        consonants++;
      }
    }
    System.out.println(vowel+" "+consonants);
  }

  @Test
  public void test10() {
    List<String> list = new LinkedList<>();
    list.add("1");
    list.add("2");
    list.add("3");

    System.out.println(list.size());

    int count = 0;
    Iterator it = list.listIterator();
    while (it.hasNext()){
      it.next();
      count++;
    }
    System.out.println(count);
  }

  @Test
  public void test11() {
    String input = "Hello world";
    char[] ch = input.toCharArray();

    for (int i = 0; i<ch.length/2; i++){
      char temp = ch[i];
      ch[i] = ch[ch.length - i - 1];
      ch[ch.length - i - 1] = temp;
    }
    String res = new String(ch);
    System.out.println(res);
  }

  @Test
  public void test12() {
    String a = "test";
    String b = "ttse";

  }
  public static String sort(String phrase) {
    char[] ch = phrase.toCharArray();
    Arrays.sort(ch);
    return new String(ch);
  }

  public static boolean isPermutation(String c, String d){
    c = c.toLowerCase();
    d = d.toLowerCase();

    c = c.replace(" ", "");
    d = d.replace(" ", "");

    if (c.length() != d.length()){
      return false;
    }
    return true;
  }

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
   // System.out.printf("Unsorted array : %s %n", Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers));

    for (int i = 0; i<numbers.length; i++){
      for (int j = numbers.length - 1; j>i; j--) {
        if (numbers[j]<numbers[i]){
          swap(numbers, j, j-1);
        }
      }
    }
   // System.out.printf("Unsorted array : %s %n", Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers));
  }

  public static void swap(int[] array, int from, int to) {
    int temp = array[from];
    array[from] = array[to];
    array[to] = temp;
  }

}
