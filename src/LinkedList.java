class LinkedList{
  Node head;
  public LinkedList(){
      this.head = null;
  }
  public void display(){
      Node current = head;
      while(current != null){
          System.out.println(current.data);
          current = current.next;
      }}

      public void insert(int data){
          Node newNode = new Node(data);
          if (head == null){
              head = newNode;
           }
           else{
              newNode.next = head;
              head = newNode;
              }
           }

           public void delete(){
              head = head.next;
  
               }
  }