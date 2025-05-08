package string;

public class LongestCommonPrefix {

    public static String getLongestCommonPrefix(String [] array){

        String ansString = "";
        String firstString = array[0];
        String subString = "";
        for (int i = 0 ;  i< firstString.length() ; i++){



            for (int j = 1 ; j< array.length ; j++){

                if (!array[j].contains(subString)){

                    return ansString;

                }
                ansString = subString;

            }
            subString =subString + firstString.charAt(i);



        }

        return ansString;

    }

    public static void main(String [] args){

        String [] array = new String[]{"flower","flow","flight"};

        System.out.println(getLongestCommonPrefix(array));

    }

}
