import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {

        boolean isElementPresent = false;
        if (lists.length == 0){
            return new ListNode().next;
        }
        if (lists.length == 1){
            if (lists[0]==null){
                return new ListNode().next;
            }
        }
        List<Integer> list =new ArrayList<>();
        for(int index = 0 ; index < lists.length ; index++){
            ListNode temp = lists[index];

            if(temp != null) {
                while (temp!=null){
                    list.add(temp.val);
                    temp = temp.next;
                }
                isElementPresent = true;
            }

        }

        if(isElementPresent==false){
            return new ListNode().next;
        }

        Collections.sort(list);

        System.out.println(list);

        ListNode head = new ListNode();
        ListNode temp  = head;
        int index = 0;

        while(index<list.size()-1){
            temp.val = list.get(index);
            temp.next = new ListNode();
            temp = temp.next;
            index++;
        }

        temp.val = list.get(list.size()-1);
        return head;
    }


     public static void main(String [] args){

     }


}

/*
  class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 != null) temp.next = list1;
        else temp.next = list2;

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists)
    {
        ListNode head = null;

        for(int i = 0; i < lists.length; i++){
            head = mergeTwoLists(head, lists[i]);
        }

        return head;
    }
}
 */




