import java.util.Arrays;

public class EditOperations {

    public static int getOperations(String string1 , String string2 , int [] array1 , int [] array2){

         for (int index = 0 ; index < string1.length() ; index ++){
                array1[string1.charAt(index)-'a']+=1;
             System.out.print(string1.charAt(index));
         }
        System.out.println();

        for (int index = 0 ; index < string2.length() ; index ++){
            array2[string2.charAt(index)-'a']+=1;
            System.out.print(string2.charAt(index));
        }
        System.out.println();
        int numberOfOperations = 0 ;

        for (int index = 0 ; index < array1.length ; index++){
            numberOfOperations += Math.abs(array1[index]-array2[index]);
        }
        System.out.print("[");
        for (int i = 0; i< 26 ; i++){
            System.out.print((char)(97+i) + ",");
        }
        System.out.print("]");
        System.out.println();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        return numberOfOperations;
    }

    public static int getOperations(String string1 , String string2 , int n  , int m){

        if (m == 0){
            return n ;
        }

        if ( n == 0){
            return m;
        }

        if (string1.charAt(m) == string2.charAt(n)) {

            return getOperations(string1,string2,n-1,m-1);
        }

        return 1 + Math.min(getOperations(string1,string2,n-1,m-1),Math.min(getOperations(string1,string2,n-1,m),getOperations(string1,string2,n,m-1)));

    }

    public static void main(String [] args){
        String string1 = "geexsfrgeekks";
        String string2 = "geeksforgeeks";
        int [] string1Array = new int[26];
        int [] string2Array = new int[26];
        System.out.println(getOperations(string1,string2,string1Array,string2Array));
    }

}
