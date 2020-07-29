package acceptance.algorithm;

import org.testng.Assert;

import java.util.Arrays;

public class PalindromeString {
  public static void main(String[] args) {
    String s = "Tact Coa";
    String r = "ta co caT";
   // System.out.println(isPalindrome(s));
    System.out.println(isPermutation(s,r));
  }

/*  public static boolean isPalindrome (String a){
    int aLength = a.length();
    for (int i = 0; i < a.length() / 2; i++){
      if (a.charAt(i) !=a.charAt(aLength - i - 1)){
        return false;
      }
    }
    return true;
  }*/

  public static String sort(String s) {
    char[] content = s.toCharArray();
    Arrays.sort(content);
    return new String(content);
  }

  public static boolean isPermutation(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    a = a.replace(" ", "");
    b = b.replace(" ", "");
    if (a.length() !=  b.length()){
      return false;
    }
    return sort(a).equals(sort(b));
  }
}
