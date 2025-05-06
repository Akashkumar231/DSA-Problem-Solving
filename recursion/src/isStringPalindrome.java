public class isStringPalindrome {

    public static boolean isPalindrome(String word , int firstIndex , int lastIndex){

        if (firstIndex > lastIndex){
            return true;

        }

        if (word.charAt(firstIndex) !=word.charAt(lastIndex)){
            return false;
        }

        return isPalindrome(word,firstIndex+1,lastIndex-1);

    }

    public static void main(String [] args){
        String word = "1222225751";

        System.out.println(isPalindrome(word,0,word.length()-1));
    }

}
