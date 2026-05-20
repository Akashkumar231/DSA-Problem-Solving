public class Find_the_Prefix_Common_Array_of_Two_Arrays_2657 {

    // Brute Force Approach
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int [] C = new int [n] ;
        for(int index = 0 ; index < n ; index++){
            int count = 0;
            int jindex = 0;
            while(jindex <= index){
                int value = A[jindex];

                for(int zindex = 0 ; zindex <= index; zindex++){
                    if(value == B[zindex]){
                        count ++;
                    }
                }
                jindex++;
            }
            C[index] = count;
        }
        return C;
    }

    // Optimized Approach Pattern
    public static int[] findPrefIxCommonArray(int [] A, int [] B){

        int n = A.length;
        int [] freq = new int[n+1];
        int [] count = new int[n];
        int common = 0;
        for (int index = 0 ; index < A.length ; index++){

            freq[A[index]]++;

            if (freq[A[index]]==2){
                common++;
            }

            freq[B[index]]++;

            if (freq[B[index]] == 2){
                common++;
            }

            count[index]= common;

        }
return count;
    }

    public static void main(String [] args){

    }

}
