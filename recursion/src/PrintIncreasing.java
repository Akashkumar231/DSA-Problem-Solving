public class PrintIncreasing {



    public static void printDecreasing(int number){
        if (number == 0){
            return;
        }

        printDecreasing(number-1);

        System.out.println(number);

    }

    public static void main(String [] args){

        printDecreasing(5);

    }

}
