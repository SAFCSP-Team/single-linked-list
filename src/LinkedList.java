public class LinkedList {
 Node head;

 public void insert(int data){
  Node newNode = new Node(data);
  if(this.head == null){
    this.head = newNode;
  }else{
    newNode.next = this.head;
    this.head = newNode;
  }
  
 }

 public void display(){
  Node current = head;
  while (current != null){
    System.out.println(current.data);
    current = current.next;
  } 
 }

}


