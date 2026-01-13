public class PrintZigZag {

    public static void printZigZag(int n){

        if (n == 0){
            return;
        }

        System.out.print(n);

        printZigZag(n-1);

        System.out.print(n);

        printZigZag(n-1);

        System.out.print(n);

    }

    public static void main(String [] args){

        printZigZag(3);

    }

}
