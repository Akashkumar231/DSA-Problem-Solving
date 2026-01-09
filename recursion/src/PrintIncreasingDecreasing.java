public class PrintIncreasingDecreasing {
    // print out put { 5 , 4 , 3 , 2  1 1 2 3 4 5 }
    /*
       Expectation = printIncreasingDecreasing(number)
       Faith = printIncreasingDecreasing(number - 1)
       Remaining = print(n) functionCall print(n)
     */
    public static void printIncreasingDecreasing(int number){

        if (number == 0){
            return;
        }

        System.out.println(number);

        printIncreasingDecreasing(number-1);

        System.out.println(number);

    }

    public static void main(String [] args){
        System.out.println(5);
        printIncreasingDecreasing(5);
    }

}
