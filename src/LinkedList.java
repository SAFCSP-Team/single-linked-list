
public class Node {
  int data;
  Node next;

 public Node(int d) {
  data = d;
  next = null;
  }

}

public class LinkedList {
 Node head;

 /* your code here */

}


public class Main {
 public static void main(String[] args) {
  LinkedList list = new LinkedList();
  list.head = new Node(100);
   Node second = new Node(200);
   Node third = new Node(300);
   list.head.next = second;
   second.next = third; 
   list.display();
     }
}
