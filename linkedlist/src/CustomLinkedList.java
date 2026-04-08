public class CustomLinkedList {

  private Node head = null;
  private Node tail = null;
  private int size;



  CustomLinkedList()
  {
    head = null ;
    tail = null;
    size = 0;
  }

  public void insertTail(int value)
  {

      if (head == null){
          head = tail = new Node(value);
      }else {
          tail.next = new Node(value);
          tail = tail.next;
      }
      this.size++;

  }

  public void insertHead(int value){

      Node node  = new Node(value);
      node.next = head;
      head = node;
      if (size==0){
          tail = node;
      }
    this.size++;

  }

  public void traverseList(){
      Node temp = this.head;
      while (temp!= null){
          System.out.print(temp.data + "-->");
          temp = temp.next;
      }
  }

     private class Node{

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

        Node(int data , Node node){
         this.data = data;
         this.next = null;
        }


    }


}
