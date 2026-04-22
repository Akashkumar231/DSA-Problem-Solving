public class ReverseLinkedList {

    public static ListNode reverseLinkedList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode forward = null;

        while(curr != null){

            forward = curr.next;
            curr.next=prev;
            prev = curr;
            curr = forward;

        }
        curr = prev;
        return curr;
    }

    public static void traverseLinkedList(ListNode head)
    {
        while(head!= null)
        {
            System.out.print( head.val + "-->");
            head=head.next;
        }
    }

    public static ListNode moveForward(ListNode head , int k){

        ListNode temp  = head;

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = head;
        int i = 0;
        while(i<k){
            head = head.next;
            i++;
        }

        ListNode newNode = head.next;
        head.next = null;
        head = newNode;
        return head;
    }

    public static void main(String [] args)
    {
        ListNode  head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(6);
        head.next = node1;
        node1.next= node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;
        traverseLinkedList(head);
        System.out.println();
        head = moveForward(head,2);
        traverseLinkedList(head);
        head =  reverseLinkedList(head);
        System.out.println();

        traverseLinkedList(head);
    }

}
