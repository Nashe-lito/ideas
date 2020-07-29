package acceptance.algorithm;

public class ForInFor {
  public static void main(String[] args) {
    for (int i = 0; i < 4; i++){
      System.out.println("Test i" + i);

      for (int j = i + 1; j < 3; j++){
       System.out.println(i);
        System.out.println(j);
       // System.out.println("Test j");
      }
    }
  }
}
