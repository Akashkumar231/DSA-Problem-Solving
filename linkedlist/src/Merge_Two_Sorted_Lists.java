import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_Two_Sorted_Lists {

      public class ListNode {
          int val;
          ListNode next;

          ListNode() {
          }

          ListNode(int val) {
              this.val = val;
          }

          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Naive Approach
        List<Integer> arrayList = new ArrayList<Integer>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        if(list1==null && list2==null){
            return list1;
        }

        if(list1==null){
            return list2;
        }

        if(list2==null){
            return list1;
        }

        while(temp1!=null){
            arrayList.add(temp1.val);
            temp1=temp1.next;
        }

        while(temp2!=null){
            arrayList.add(temp2.val);
            temp2=temp2.next;
        }

        Collections.sort(arrayList);
        ListNode head = new ListNode();
        ListNode temp  = head;
        int index = 0;

        while(index<arrayList.size()-1){
            temp.val = arrayList.get(index);
            temp.next = new ListNode();
            temp = temp.next;
            index++;
        }
        temp.val = arrayList.get(arrayList.size()-1);
        return head;
    }
}
