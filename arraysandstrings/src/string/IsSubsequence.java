package string;

import java.util.Arrays;

public class IsSubsequence {

    public static boolean isSubsequence(String string1 , String string2){

        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1< string1.length()  && pointer2 < string2.length()){

            if (string1.charAt(pointer1)== string2.charAt(pointer2)){
                pointer1++;
                pointer2++;
            }else{
                pointer2++;
            }

        }

        return string1.length() == pointer1;
    }

    public static String longestString(String [] strings , String string){
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        String ans = "";
        for (int i = 0; i< strings.length  ; i++){

            String s = strings[i];

            if (isSubsequence(s,string)){
               if (s.length() > ans.length()){
                   ans = s;
               }
            }


        }
        return ans;

    }

    public static void main(String [] args){
        System.out.println(isSubsequence("monkey","abpcplea"));
        System.out.println(longestString(new String[]{"ale","apple","monkey","plea"},"abpcplea"));
    }

}
