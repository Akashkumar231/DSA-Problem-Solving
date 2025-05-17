public class Moore_s_Voting_Algorithm {

    public static int Moore_s_Algorithm(int [] array){

        int majority = array[0];
        int count = 1;

        for (int i = 1 ; i< array.length ; i++)
        {
             if (array[i] != majority){
                 count--;
                 if (count==0){
                     majority=array[i];
                     count++;
                 }
             }else {
                 count++;
             }

        }

        return majority;

    }

    public static void main(String [] args){

        int [] array = new int[]{2,2,3,3,1,2,2,3,3,2,3,3,3};

        System.out.println(Moore_s_Algorithm(array));

    }

}
