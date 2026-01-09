public class PrintDecreasing {


    public static void printDecreasing(int number){
        if (number == 0){
            return;
        }

        System.out.println(number);

        printDecreasing(number-1);

    }

    public static void main(String [] args){

        printDecreasing(5);

    }

}
