package acceptance.algorithm;

public class ReplaceSpaces2 {
  public static void main(String[] args) {
    String str = "Mr John Smith  ";
    String replaces = str.replaceAll(" ", "%20");
    System.out.println(replaces);
  }
}
