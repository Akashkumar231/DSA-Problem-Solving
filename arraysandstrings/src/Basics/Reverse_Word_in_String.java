package Basics;

public class Reverse_Word_in_String {

    public static String reverse_word(String word){

        int right = word.length()-1;
        StringBuilder result = new StringBuilder("");

        while (right>0){
            while (right>=0 && word.charAt(right)==' '){
                right--;
            }

            int left = right ;

            while (left>=0 && word.charAt(left)!=' '){
                left--;
            }

            if (!result.isEmpty() && left<right) result.append(" ");
            int index = left+1;
            while (index<=right){
                result.append(word.charAt(index));
                index++;

            }
            right = left;

        }
        return result.toString();

    }

    public static void main(String [] args){

        System.out.println(reverse_word("    blue    is  sky"));

    }
}
