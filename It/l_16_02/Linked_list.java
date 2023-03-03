package l_16_02;

import java.util.LinkedList;

public class Linked_list {

  public static void main(String[] args) {
    //Linked List связанный список на основе узлов
    // (узел это ссылка на другой элемент списка
    //1-й элемент содержит ссылку на 2-й ..
    // n-й элемент содержит ссылки на n - 1 (предыдущий)
    // и n + 1 (следующий) элементы
    // ... последний элемент содержит ссылку на предыдущий

    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    linkedList.add(23);
    linkedList.add(24);
    linkedList.add(25);
    linkedList.add(28);
    linkedList.add(29);

    System.out.println("Linked list before peek() ");
    System.out.println(linkedList);
    System.out.println("element peeked " + linkedList.peek());
    System.out.println("Linked list after peek() ");
    System.out.println(linkedList);

    System.out.println("Linked list before peekFirst() ");
    System.out.println(linkedList);
    System.out.println("element peeked " + linkedList.peekFirst());
    System.out.println("Linked list after peekFirst() ");
    System.out.println(linkedList);

    System.out.println("Linked list before peekLast() ");
    System.out.println(linkedList);
    System.out.println("element peeked " + linkedList.peekLast());
    System.out.println("Linked list after peekLast() ");
    System.out.println(linkedList);
  }

}
