package MediumQuesitons;

import java.util.HashMap;

public class FindingRecurringSequence {



    public static String findingRecurringSequence(int a, int b){

        if (a==0){
            return "No recurring sequence";
        }
        String result = a<0 && b<0 ? "-" : "";

        a=Math.abs(a);
        b = Math.abs(b);
        result=result+a/b;
        int rem = a % b;
        if (rem == 0){
            return result;
        }
        result=result+".";
        HashMap<Integer,Integer> hashMap =  new HashMap<>();

        while (rem>0){

            // if the key already exist then perform action and return.
            if (hashMap.containsKey(rem)){

                return "Recurring sequence is "+ result.substring(hashMap.get(rem));

            }

            hashMap.put(rem,result.length());

            rem = rem *10;

            result+=Integer.toString(rem/b);

            rem = rem % b;


        }


        return  "No recurring sequence";
    }

    public static void main(String [] args){

        System.out.println(findingRecurringSequence(11,2));



    }


}
