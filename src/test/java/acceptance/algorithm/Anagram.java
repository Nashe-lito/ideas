package acceptance.algorithm;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
  String s = "god";
  String t = "dgo";
  System.out.println(permutation(s, t));
  System.out.println(permutation1(s, t));
  }

public static String sort(String s) {
    char[] content = s.toCharArray();
    Arrays.sort(content);
    return new String(content);
  }

 public static boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    return sort(s).equals(sort(t));
  }
  // OR

  public static boolean permutation1(String s, String t) {
    if (s.length() != t.length()){
      return false;
    }

    int [] letters = new int[128];
    char[] sArray = s.toCharArray();
    for (char c : sArray) {
      letters[c]++;
    }

    for (int i = 0; i < t.length(); i++) {
      int c = (int) t.charAt(i);
      letters[c]--;
      if (letters[c] < 0) {
        return false;
      }
    }
    return true;
  }
}
