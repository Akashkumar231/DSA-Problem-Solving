package array;

public class BestTimeToSellAndBuyStocks {

    public static int getMaximumProfit(int [] array){

        int min = array[0];
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1 ; i< array.length ;i++){

            int cost = array[i]-min;
            maxProfit = Integer.max(maxProfit,cost);
            min = Integer.min(min,array[i]);
        }

        return maxProfit;

    }

    public static void main(String [] args){

        System.out.println(getMaximumProfit(new int[]{7,1,5,3,6,4}));

    }

}
