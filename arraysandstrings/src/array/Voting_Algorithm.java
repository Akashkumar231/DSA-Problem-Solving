package array;

public class Voting_Algorithm {

    public static int getMajority(int [] array){

        int majority = array[0];
        int count = 1;

        for (int i = 1 ; i<array.length ; i++){

            if (majority!=array[i]){
                count--;
            }else if (majority==array[i]){
                count++;
            }
            if (count==0){
                majority=array[i];
                count=1;
            }

        }

        return majority;

    }

    public static void main(String [] args){

        int [] array = new int[]{10,10,20};
        System.out.println(getMajority(array));

    }

}
