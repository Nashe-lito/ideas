package acceptance.algorithm;

import org.apache.commons.math3.analysis.function.Log;
import org.testng.annotations.Test;

import java.util.*;

public class Collections {

  @Test
  // Узнать ключ и значение
  public void Map() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("Test1", 1);
    map.put("Test3", 3);
    map.put("Test5", 5);

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }

//Изменить ключ для значения "Test2"
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
    System.out.println("_________");
    System.out.println(hashMap);
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
    // cоздание списка
   String str1 = new String("test1");
   String str2 = new String("test2");
   String str3 = new String("test3");
   String str4 = new String("test4");

   LinkedList<String> linkedList = new LinkedList<String>();
   linkedList.add(str1);
   linkedList.add(str2);
   linkedList.add(str3);
   linkedList.add(str4);

   System.out.println(linkedList);
  }

  @Test
  public void testLinkedList2() {
    String str1 = new String("test1");
    String str2 = new String("test2");
    String str3 = new String("test3");
    String str4 = new String("test4");

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add(str1);
    linkedList.add(str3);
    linkedList.add(1, str2);

    System.out.println(linkedList.indexOf(str1));
  }

  @Test
  public void testLinkedList3() {
    String str1 = new String("test1");
    String str2 = new String("test2");
    String str3 = new String("test3");
    String str4 = new String("test4");

    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add(str1);
    linkedList.add(str3);
    linkedList.add(1, str2);

    linkedList.remove(1);
    System.out.println(linkedList);
  }

  @Test
  public void testttt(){
    List<String> list = new LinkedList<>();
    list.add("Test1");
    list.add("Test2");
    list.add("Test3");

    System.out.println(list);

    list.remove("Test3");
    System.out.println(list);
  }

  @Test
  public void testLinkedListPrev() {
    LinkedList<String> linkedList = new LinkedList<>();
    ListIterator<String> iterator = null;

    linkedList.add(new String("Test1"));
    linkedList.add(new String("Test2"));
    linkedList.add(new String("Test3"));
    linkedList.add(new String("Test4"));
    System.out.println(linkedList);

    iterator = linkedList.listIterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("--------------");
    while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
  }

  @Test
  public void test2() {
    List<String> l = new LinkedList<>();
    ListIterator<String> i = null;
    l.add("q");
    l.add("w");
    l.add("e");

    i = l.listIterator();
    while (i.hasNext()){
      System.out.println(i.next());
    }
    while (i.hasPrevious()){
      System.out.println(i.previous());
    }

  }

  @Test
  public void testForStudy(){
    Map<String,Integer> map = new HashMap<>();
    map.put("qwerty", 1);
    map.put("asdfgh", 2);
    map.put("zxcvb", 3);

    int code = map.hashCode();
    System.out.println(map);
    System.out.println(code);

    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("b");
    set.add("c");
    set.add("a");
    System.out.println(set);

    System.out.println(set.hashCode());
    System.out.println(set.equals("[a, b, c]"));
  }

  @Test
  public void testRecurs(){
    List<String> list = new LinkedList<>();
    list.add("Test1");
    list.add("Test2");
    list.add("Test3");

  }
    }