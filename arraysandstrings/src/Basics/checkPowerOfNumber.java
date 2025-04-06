package Basics;

public class checkPowerOfNumber {


    public static boolean isPower(int x , int y){

        while(y>1){
            if(y%x != 0){
                return false;
            }
            y=y/x;
        }

        return true;
    }

    public static void main(String [] args){

         System.out.println(isPower(100,100));


    }

}
