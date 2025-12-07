package Basics;

public class Solution {

    public static String reverse(String string){
        int right = 0;
        int left = 0;
        StringBuilder stringBuilder = new StringBuilder("");
        while(right< string.length() ){

            while(right<string.length() && string.charAt(right)!=' '){
                right++;
            }
            int index = right -1;

            while(index>=left){
                stringBuilder.append(string.charAt(index));
                index--;
            }

            if(stringBuilder.length()!=0 && right<string.length()-1){
                stringBuilder.append(" ");
            }

            left = right ;
            while(left<string.length() && string.charAt(left)==' '){
                left++;
            }
            right = left;

        }
        return stringBuilder.toString();
    }

    public static void main(String [] args){
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }

}
