package Basics;

public class AddBigIntegers {

    public static void AddIntegers(String num1, String num2) {
        int firstLength = num1.length() - 1;
        int secondLength = num2.length() - 1;
        int carry = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (firstLength >= 0 || secondLength >= 0 || carry > 0) {

            int d1 = (firstLength>=0) ? num1.charAt(firstLength)-'0' : 0;
            int d2 = (secondLength>=0) ? num2.charAt(secondLength)-'0' : 0;

            int sum = d1 + d2 + carry;
            carry = sum /10;

            stringBuilder.append(sum%10);
            firstLength--;
            secondLength--;
        }


        System.out.println(stringBuilder.reverse());

    }
    public static void main(String [] args){
        AddIntegers("4230965","71695402");
    }
}
