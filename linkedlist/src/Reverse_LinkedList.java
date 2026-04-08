 /*

    Reverse a LinkedList
    1) Data - Iterative
    2) Pointer - Recursive
    3) Data - Recursion
    4) Pointer - Recursion
  */
// LinkedList
// 10->20->30->40-> End
//
// 1) I will store the value in array.
// 2) Try to traverse the list from start and then insert the data in linkedList.



 import java.util.LinkedList;

 public class Reverse_LinkedList {

   public static class Node{
       int dataValue;
       Node next;
       Node(int dataValue){
           this.dataValue = dataValue;
           this.next=null;
       }
   }

   public static class LinkedList{

       Node head = null;

       // Display the linkedList.
       public  void display(Node head){
           Node temp = head;
           while(temp!=null){
               System.out.print(temp.dataValue + " --> ");
               temp=temp.next;
           }
       }

       // Adding Node in last.
       public  void addNode(int dataValue){

           if(this.head == null){
               Node node = new Node(dataValue);
               this.head = node;
               return;
           }

           Node temp  = head;
           while(temp.next!=null){
               temp=temp.next;
           }
           Node node = new Node(dataValue);
           temp.next  = node;
       }



   }

    public void reverseLinkedList(LinkedList linkedList){




    }

    public static void main(String [] args){

        LinkedList linkedList = new LinkedList();
        Node head = linkedList.head;
        linkedList.addNode(45);
        linkedList.display(head);
        linkedList.addNode(55);
        linkedList.addNode(65);
        linkedList.addNode(75);
        linkedList.display(head);
    }

}
