package MediumQuesitons;

import java.util.HashMap;

/*
Given two integers a and b(b != 0), the task is to return the fraction a/b in string format. If the fractional part is repeating, enclose the repeating part in parentheses.

Examples:

Input: a = 1, b = 2
Output: “0.5”
Explanation: 1/2 = 0.5 with no repeating part.

Input: a = 50, b = 22
Output: “2.(27)”
Explanation: 50/22 = 2.27272727… Since fractional part (27) is repeating, it is enclosed in parentheses.
 */
public class Fraction_t_Recurring_Decimal {

    public String getRecurringDecimal(int a, int b){

        if (a==0){
            return "0";
        }
        String result = a<0 && b<0 ? "-" : "";

        a=Math.abs(a);
        b = Math.abs(b);
        result=result+a/b;
        int rem = a % b;
        if (rem == 0){
            return result;
        }

        HashMap<Integer,Integer> hashMap =  new HashMap<>();

        while (rem>0){

            // if the key already exist then perform action and return.
            if (hashMap.containsKey(rem)){

                result = result.substring(0,hashMap.get(rem))+"("+ result.substring(hashMap.get(rem))+")";
                break;
            }

            hashMap.put(rem,result.length());

            rem = rem *10;

            result+=Integer.toString(rem/b);

            rem = rem % 10;


        }


return  result;
    }

    public static void main(String [] args){




    }

}
