package Basics;

public class MultiplyBigIntegers {

    public static String addTwoInteger(String num1  , String num2){
        StringBuilder result =new StringBuilder();
        int l1 = num1.length()-1;
        int l2 = num2.length()-1;
        int carry = 0;
        while(l1>=0 || l2 >=0 || carry>0){

            int sum = (l1>=0?num1.charAt(l1)-'0':0) + (l2>=0?num2.charAt(l2)-'0':0) + carry;

            result.append(sum%10);
            carry = sum /10;
            l1--;
            l2--;
        }
        return result.reverse().toString();
    }

    public static String multiplyInteger(String num1 , int d1){
        StringBuilder result = new StringBuilder();
        int l1 = num1.length()-1;
        int carry = 0;
        while(l1>=0 ||  carry>0){

            int product = (l1>=0?num1.charAt(l1)-'0':0)*d1  + carry;

            result.append(product%10);
            carry = product /10;
            l1--;
        }
        return result.reverse().toString();
    }

    public static void main(String [] args){

        System.out.println(multiplyInteger("150",2));
        String num1 = "473";
        String num2 = "695";
        System.out.println(addTwoInteger(num1,num2));
        String result = "";
        int count = 0;
        for (int index = num2.length()-1 ; index >= 0 ; index-- ){
            int d2 = num2.charAt(index) - '0';
            String sum = multiplyInteger(num1,d2);
            for (int c = 0 ;  c < count ; c++){
                sum +="0";
            }

            result = addTwoInteger(sum,result)
                    ;
            count++;
        }
        System.out.println(result);

    }

}
