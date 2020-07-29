package acceptance.linked;

import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FindMiddleElement {
  @Test
  public void testFindMiddleElementByInt() {
    List <Integer> linkedList = new LinkedList();
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(100);
    linkedList.add(9);
    linkedList.add(4);

    int size = linkedList.size();
    int middle = linkedList.get(size/2);

    System.out.println(linkedList);
    System.out.println(size);
    System.out.println(middle);

    int middle2 = linkedList.get(linkedList.size()/2);
    System.out.println(middle2);
  }

  @Test
  public void testFindMiddleElementByString() {
    List<String> linkedList = new LinkedList<>();
    linkedList.add("Test1");
    linkedList.add("Test2");
    linkedList.add("Test3");
    linkedList.add("Test4");
    linkedList.add("Test5");
    linkedList.add("Test6");
    linkedList.add("Test7");

    int size = linkedList.size();
    String middle = linkedList.get(size/2);
    String middle2 = linkedList.get(linkedList.size()/2);

    System.out.println(linkedList);
    System.out.println(size);
    System.out.println(middle);
  }
//  daria$ cd /Users/daria/Documents/Devel/

}
