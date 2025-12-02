package Basics;

public class ReverseWord {

    public static String reverseWords(String word){

        String [] strings = word.split("\s+");
        // multiple spaces : single split

        StringBuilder res = new StringBuilder();

        for (int index = strings.length-1 ; index >=0 ; index--){
            if (index < strings.length-1){
                res.append(" ");
            }
            res.append(strings[index]);
        }

        return res.toString();
    }

    public static void main(String [] args){
        String word = " How are you doing ";
        System.out.println(word.trim());
        System.out.println(reverseWords(word.trim()));

    }
}
