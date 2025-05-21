package array;

import java.util.Arrays;

public class Zero_Array_Transformation_I {

    public static void zeroArrayTransformation(int [] array , int [][] queries ){

        int [] diff = new int[array.length];

        for(int [] query : queries){

            int first = query[0];
            int second = query[1];
            int x = 1;
            diff[first]+=1;
            if (second+1<array.length){
                diff[second+1]-=1;
            }


        }



        int [] result = new int[diff.length];
        int cumSum = 0;

        for (int i = 0 ;  i<diff.length ; i++){
            cumSum+=diff[i];
            result[i]= cumSum;
        }

        System.out.println(Arrays.toString(result));

    }

    public static void main(String [] args){

        int [] array = new int[]{1,0,1};
        int [][] queries = new int[][]{{0,2}};

        zeroArrayTransformation(array,queries);

    }

}
