package Basics;

public class CountDigits {

    public static int getDigits(int n){
        int length = (int) (Math.log10(n)+1);
        return length;
    }

    public static void main(String [] args)
    {
        System.out.println(getDigits(45698));
    }

}
