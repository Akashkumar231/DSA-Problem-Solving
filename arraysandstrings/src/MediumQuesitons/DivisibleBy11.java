package MediumQuesitons;


/*
Check if a large number is divisible by 11 or not.

Given a number, the task is to check if the number is divisible by 11 or not. The input number may be large and it may not be possible to store it even if we use long long int.

Examples:
Input : n = 76945
Output : Yes
Input  : n = 1234567589333892
Output : Yes
Input  : n = 363588395960667043875487
Output : No


 */

public class DivisibleBy11 {

    public static boolean isDivisible(String number){

        int total = 0;
        for (int i = 0 ; i< number.length(); i++){

            if (i%2==0){
                int ch = number.charAt(i)-'0';
                total+=ch;

            }
            else {
                int ch = number.charAt(i)-'0';
                total-=ch;
            }

        }

         if (total%11==0){
             return true;
         }



        return false;
    }

    public static void main(String [] args){

        System.out.println(isDivisible("363588395960667043875487"));

    }
}
