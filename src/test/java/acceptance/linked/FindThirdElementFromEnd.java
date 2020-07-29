package acceptance.linked;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class FindThirdElementFromEnd {
  public static void main(String[] args) {
    LinkedList<String> linkedList = new LinkedList<>();
    ListIterator<String> listIterator = null;
    linkedList.add("1");
    linkedList.add("2");
    linkedList.add("3");
    linkedList.add("4");
    linkedList.add("5");

    System.out.println("List is: " + linkedList);

    listIterator = linkedList.listIterator();


  }


}
