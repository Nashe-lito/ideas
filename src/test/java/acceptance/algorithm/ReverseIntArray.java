package acceptance.algorithm;

import java.util.*;

public class ReverseIntArray {
  public static void main(String[] args) {
    // Изначальный массив
    int[] array = new  int[] {1, 2, 3, 4,};

    //

    for (int i=0; i<array.length/2; i++){
      int temp = array[i];
      array[i] = array[array.length - i - 1];
      // array.length - i - 1 Формула для определения противоположного элемента массива
      // array.length - длинна массива
      // length = 4(1, 2, 3, 4), а последний индекс = 3. Поэтому - 1
      array[array.length - i - 1] = temp;
     // При первой итерации array[0], т.е. в temp лежит 1
      //Потом меняет элементы местами, т.е. говорим, что array[0] теперь array[array.length - i - 1]
      // т.е. array[0] = array[1 - i - 1] итого array[0] = 4(последнему элементу)
      // а  array[array.length - i - 1] = temp,куда мы как помнм положили array[0]
      // Массив выглядить так {4, 2, 3, 1}
      // Потом следующи й проход меняет меняет средние элементы и получается {4, 3, 2, 1}


    }

    // Конечный массив в консоль
    for (int i = 0; i<array.length; i++)
    {
      System.out.println(array[i]);
    }

  }


}
