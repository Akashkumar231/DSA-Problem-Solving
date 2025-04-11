package array;

public class Count_Symmetric_Integers {

    public static int getSumFromCharArray(char [] array , int firstIndex , int lastIndex){

        int sum = 0;

        for(int i = firstIndex ; i<lastIndex;i++){
            sum = sum + (array[i]-'0');
        }
        return sum;

    }

    public static int getCount(int low , int high){

        int count = 0;

        while(low<=high){

            String number = low+"";
            if (number.length()%2!=0){
                low++;
                continue;
            }
            else{
                char [] arr = number.toCharArray();
                int half = arr.length/2;
                int firstSum = getSumFromCharArray(arr,0,half);
                int secondSum = getSumFromCharArray(arr,half,arr.length);
                if (firstSum==secondSum){
                    count++;
                }

            }

    low++;

        }
return count;
    }

    public static void main(String [] args){

        System.out.println(getCount(1200,1230));

    }

}
