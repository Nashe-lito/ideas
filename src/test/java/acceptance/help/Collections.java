package acceptance.help;

import org.apache.commons.math3.analysis.function.Log;
import org.testng.annotations.Test;

import java.util.*;

public class Collections {

  @Test
  public void Map() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Test1", 1);
    map.put("Test3", 3);
    map.put("Test5", 5);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

  @Test
  public void addMap() {
    //Создаем хеш-карточку
    Map<String, Integer> hashMap = new HashMap<String, Integer>();

    //Помещаем данные в карточку
    hashMap.put("Test2", 2);
    hashMap.put("Test4", 4);
    hashMap.put("Test6", 6);

    //Получаем набор элементов

    Set<Map.Entry<String, Integer>> set = hashMap.entrySet();

    //Отображаем набор
    for (Map.Entry<String, Integer> entry : set) {
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }

    //Добавляем значение
    int value = hashMap.get("Test2");
    hashMap.put("Test2", value + 3);
    System.out.println("Test2 is: " + hashMap.get("Test2"));

  }

  @Test
  public void testTwo() {
    Random random = new Random(36);
    Map<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < 100; i++) {
      int number = random.nextInt(10);
      Integer frequency = hashMap.get(number);
      hashMap.put(number, frequency == null ? 1 : frequency + 1);
    }
    System.out.println(hashMap);
  }

  @Test
  public void methodForRemember() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Vaska", 1);
    map.put("Murka", 2);
    map.put("Kava", 3);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + entry.getValue());
    }
  }

  @Test
  public void list() {
    ArrayList<String> days = new ArrayList<>();
    days.add("Mon");
    days.add("Tue");
    days.add("Wed");
    days.add("Thu");
    days.add("Fri");
    days.add("Sat");
    days.add("Sun");

    String[] dayArray = days.toArray(new String[days.size()]);
    System.out.println("Массив: " + Arrays.toString(dayArray));

    String[] daysArray = days.stream().toArray(String[]::new);
    System.out.println("Массив: " + Arrays.toString(dayArray));
  }

  @Test
  public void testLinkedList() {
   List<String> linkedList = new LinkedList<>();
   linkedList.add("Test1");
   linkedList.add("Test2");
   linkedList.add("Test3");

   Iterator<String> iterator = linkedList.iterator();
   String firstTest = iterator.next();
    Log.i("TTT", firstTest);
    String secondTest = iterator.next();
    Log.i("TTT", secondTest);
  }
}
