package MediumQuesitons;

// K-th digit in ‘a’ raised to power ‘b’

/*
Given three numbers a, b and k, find k-th digit in ab from right side

Examples:
Input : a = 3, b = 3, k = 1
Output : 7
Explanation: 3^3 = 27 for k = 1. First digit is 7 in 27


Input : a = 5, b = 2,  k = 2
Output : 2
Explanation: 5^2 = 25 for k = 2. First digit is 2 in 25
 */
public class Return_Kth_bit {

    public static int getKthBit(int a , int b , int k){

        int number = (int) Math.pow(a,b);
        String sNumber = (number+"");
        int bit = sNumber.charAt(sNumber.length()-k)-'0';
        return bit;

    }

    public static void main(String [] args){

System.out.println(getKthBit(3,3,1));
    }

}
