import java.util.ArrayList;

public class Linked_List_Cycle_II_142 {

    private static class ListNode{
        int value;
        ListNode next;

        ListNode(int value ){
           this.value = value;
           this.next = null;
        }
    }

    public static void main(String [] args){

        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode head = new ListNode(45);
        ListNode temp = head;
        while (temp!=null){
            if (arrayList.contains(temp)){
                System.out.println("Contains Cycle at : " + temp);
                break;
            }
            arrayList.add(temp);
            temp= temp.next;
        }

        System.out.println("This does not contain cycle.");
    }


}
