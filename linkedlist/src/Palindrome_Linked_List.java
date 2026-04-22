public class Palindrome_Linked_List {

    public boolean isPalindrome(ListNode head) {

        // base condition .
        if( head.next == null){
            return true;
        }

        // finding the size
        ListNode temp =  head;
        int size = 0;
        while(temp!=null){
            size++;
            temp  = temp.next;
        }

        // creating array.
        int [] array = new int [size];
        int index = 0;

        temp = head;
        // Traversing the linkedList to fill array .
        while(temp!=null){
            array[index] = temp.val;
            temp  = temp.next;
            index++;
        }

        int firstPointer = 0;
        int lastPointer = size-1;

        // Traversing array
        while(firstPointer<=lastPointer){
            if(array[firstPointer] != array[lastPointer]){
                return false;
            }
            firstPointer ++;
            lastPointer --;
        }
        return true;

    }

}
