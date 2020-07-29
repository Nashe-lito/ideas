package acceptance.algorithm;

public class Less {
  public static void main(String[] args) {
  String s = "I love java";
    System.out.println(isPalindrome(s));
  }

  public static boolean isPalindrome(String a){
    a = a.toLowerCase();
    a = a.replace(" ", "");
    int aLength = a.length();
    for (int i = 0; i<aLength/2; i++){
      if (a.charAt(i) != a.charAt(aLength - 1 - i)) {
      return false;
      }
      }
    return true;
    }
  }
