# Single Linked List

### Objective
In this project, our main goal will be to understand the fundamentals of a linked list, and their operations.
### Concepts
Use the provided resources for a better understanding.
|Concept|	Resources|
|-------|----------|
|Class LinkedList |[oracle decumention](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html) |
| Linked List Implementation|[java Tutorial](https://www.youtube.com/watch?v=SMIq13-FZSE) |

### Problem

Create a display() method, to print the content of the linked list.

### Implementation

* Create a `display()` method to print the contents of the linked list starting from the head node. It iterates through the list by following the next 
  references of each node and prints the data value.

```java

 public class Node {
  int data;
  Node next;

  Node(int d) {
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
```
