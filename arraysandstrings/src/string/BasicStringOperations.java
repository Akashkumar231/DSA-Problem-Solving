package string;

import java.util.Arrays;

public class BasicStringOperations {

    public static void main(String [] args){

        String demoString= "Hello , I am Akashkumar Yadav";

        // finding the character at particular index.
        System.out.println(demoString.charAt(1));

        // getting the index of the a particular character by defaults return first index.
        System.out.println(demoString.indexOf('a'));

        // getting the last index of a charcter
        System.out.println(demoString.lastIndexOf('a'));

        // getting the index of the substring
        System.out.println(demoString.indexOf("Akash"));

        // getting the char Array of the String.
        char [] charArry  = demoString.toCharArray();

        System.out.println(Arrays.toString(charArry));

        // getting the substring it does not include the end index.
        System.out.println(demoString.substring(10,20));

        // getting the substring from a particular index.
        System.out.println(demoString.substring(10));

        

    }

}
