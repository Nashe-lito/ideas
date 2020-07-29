package acceptance.algorithm;

public class RemoveChar {
  public static void main(String[] args) {
    String s = "Test remove";
    String c = s.toLowerCase();
    String r = c.replace("t", "");
    System.out.println(s);
    System.out.println(r);


    char removeChar = 'e';
    String result = "";

    for (int i =0; i<c.length(); i++) {
      if (c.charAt(i) != removeChar){
        result += c.charAt(i);
      }
    }
    System.out.println(result);
  }
}
