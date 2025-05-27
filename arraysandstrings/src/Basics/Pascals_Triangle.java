package Basics;

public class Pascals_Triangle {

    public static int getElementAt(int row, int col)
    {
        int result = 1;
        row=row-1;
        col=col-1;
        for(int i = 0 ; i<col;i++){
            result *= (row-i);
            result/=(i+1);
        }
      return result;
    }

    public static void printPascalsNLine(int row , int col){
        for (int i = 0 ; i<=row;i++){
            System.out.print(getElementAt(row-1,i)+" ");
        }
    }

    public static void main(String [] args){
        int row = 5;
        int col = 4;
        System.out.println(getElementAt(5,4));
        printPascalsNLine(row,col);
    }

}
