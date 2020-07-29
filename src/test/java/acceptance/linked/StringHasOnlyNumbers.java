package acceptance.linked;

public class StringHasOnlyNumbers {
  public static void main(String[] args) {
    String regex = "[0-9]+";
    String data = "234567654";
    System.out.println(data.matches(regex));

    String data2 = "foo";
    String data3 = "f0o";
    System.out.println(data2.matches(regex));
    System.out.println(data3.matches(regex));
  }
}
