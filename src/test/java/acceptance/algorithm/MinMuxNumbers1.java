package acceptance.algorithm;

public class MinMuxNumbers1 {
  public static void main(String[] args) {
    int[] array = new int[] {-20, 34, 21, -87, 92};

    int minValue = array[0];
    int maxValue = array[0];

    for (int i=0; i<array.length; i++) {
      if (array[i] < minValue){
        minValue = array[i];
      } else if (array[i] > maxValue) {
        maxValue = array[i];
      }
    }

    System.out.println(minValue);
    System.out.println(maxValue);
    }
  }

