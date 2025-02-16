package prefixSumAndSlidingWindow;

public class NumberofSubstringsContainingAllThreeCharacters {

    public static int getMaxSubArrayLength(String array , char [] chararray){

        int count = 0;

        int [] lastSeen = {-1,-1,-1};

        for(int i = 0 ; i< array.length() ; i++){

            lastSeen[array.charAt(i) -'a']=i;

            if (lastSeen[0] != -1 && lastSeen[1]!=-1 & lastSeen[2]!=-1){
                count = count  + (1+Integer.min(lastSeen[0], Integer.min(lastSeen[1],lastSeen[2])));
            }

        }

          return count;

    }

    public static void main(String [] args){

        String ans = "bbacba";

    System.out.println(getMaxSubArrayLength(ans,new char[] {'a','b','c'
    }));


    }


}
