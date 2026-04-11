public class Remove_Nth_Node_From_End_of_List {

public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slowPointer = head;
        ListNode fastPointer  = head;

        int i = 0;
        while(i<n){
            fastPointer  = fastPointer.next;
            i++;
        }

        if(fastPointer == null){
            return head.next;
        }

        while(fastPointer.next !=null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        slowPointer.next = slowPointer.next.next;

        return head;

    }

}
