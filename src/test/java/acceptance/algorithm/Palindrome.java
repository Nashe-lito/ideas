package acceptance.algorithm;

public class Palindrome {
  public static void main(String[] args) {
    String s = "Qwerty YTR Ewq";
    System.out.println(isPalindrome(s));
  }


  public static Boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = s.replace(" ", "");
    int sLen = s.length();
    for (int i = 0; i < sLen / 2; i++) {
      if (s.charAt(i) != s.charAt(sLen - i - 1)) {
        return false;
      }
    }
    return true;
  }


}
