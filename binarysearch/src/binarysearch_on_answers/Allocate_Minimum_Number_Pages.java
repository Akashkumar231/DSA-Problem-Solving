package binarysearch_on_answers;

public class Allocate_Minimum_Number_Pages {


    public static boolean isPossible(int [] books, int maxLoad,  int students){

        int currentLoad = 0 ;
        int reqdStudent  = 1 ;

        for (int pages : books){
            if (currentLoad+pages<=maxLoad){
                currentLoad+=pages;
            }
            else{
              currentLoad=pages;
              reqdStudent++;
            }
        }
        return reqdStudent<=students;
    }

    public  static int getMax(int [] books){

        int maxVal = Integer.MIN_VALUE;
        for (int book : books) {
            maxVal = Math.max(maxVal, book);
        }
        return maxVal;
    }

    public static int getSum(int [] books){
        int sum = 0;
        for (int book : books){
            sum+=book;
        }
        return sum;
    }

    public static int getMinimumOfMaximumStudent(int [] books, int maxLoad , int student)
    {
        int left = getMax(books);
        int right = getSum(books);
        while (left<=right){
            int mid = left + ( right - left)/2;
            if (isPossible(books, mid, student)){
               right = mid - 1;
            }else {
                left = mid + 1 ;
            }

        }
        return left;
    }

    public static void main(String [] args){
      int books[] = new  int [] {20,10,40,30};
      int student = 2 ;
      int book = 4;

        System.out.println(getMinimumOfMaximumStudent(books,4,2));
    }

}
