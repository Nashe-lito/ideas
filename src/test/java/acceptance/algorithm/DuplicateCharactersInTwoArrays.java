package acceptance.algorithm;

public class DuplicateCharactersInTwoArrays {
  public static void main(String[] args) {
    int[] number1 = new int[] {1, 2, 3, 4, 5};
    int[] number2 = new int[] {6, 7, 2, 8, 3};

    for (int i = 0; i < number1.length; i++) {
      int a = number1[i];
      for (int j = 0; j < number2.length; j++){
        if (a == number2[j]) {
          System.out.println(a);
          break;
        }
      }
    }
  }
}
