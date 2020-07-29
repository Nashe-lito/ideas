package acceptance.algorithm;

import org.testng.annotations.Test;

import java.util.Stack;

public class StringReverser {
  public static void main(String[] args) {
    String a = "I love Java";
    System.out.println(test2(a));
  }

  @Test
  public void test() {
    String a = "I love Java";
    String r = new StringBuffer(a).reverse().toString();
    System.out.println(r);
  }


  public static String test2(String a) {
   // String a = "I love Java";
    char[] b = a.toCharArray();
    char[] c = new char[b.length];
    for (int i = 0; i < b.length; i++) {
      c[(b.length - 1) - i] = b[i];
    }
    return new String(c);
  }

/*  public static String test3(String a) {
    Stack<Character> st = new Stack<>();
    for (Character character : a.toCharArray()){
      st.add(character);
    }
    StringBuffer sb = new StringBuffer()
  }*/
}
