package MediumQuesitons;

/*
Check if a large number is divisible by 4 or not

Given a number, the task is to check if a number is divisible by 4 or not. The input number may be large and it may not be possible to store even if we use long long int.

Examples:

Input : n = 1124
Output : Yes

Input  : n = 1234567589333862
Output : No

Input  : n = 363588395960667043875487
Output : No


 */

public class DivisibleBy_4 {

    public static boolean isDivisible(String number){

        int firstNumber = number.charAt(number.length()-1)-'0';
        int secondNumber = number.charAt(number.length()-2)-'0';
        int totalNumber = firstNumber*10+secondNumber;

        if (totalNumber%4==0){
            return true;
        }

        return false;

    }

    public static void main(String [] args){

        System.out.println(isDivisible("36358839596066704387548"));

    }
}
