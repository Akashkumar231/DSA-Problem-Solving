package string;

import java.util.Arrays;

public class CheckAnagramOrNot {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        char [] arr1 = s.toCharArray();
        char [] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for(int i= 0 ; i< arr1.length ;i++){
            System.out.println(arr1[i] + "  " + arr2[i]);
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;

    }

    public static void main(String []args){

      String  s="jar";
      String  t="jam";
      System.out.println(isAnagram(s,t));

    }

}
