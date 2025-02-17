package prefixSumAndSlidingWindow;

public class Longest_Repeating_Character_Replacement {


    public static int getMaxLongestRepeatingCharacter1(String string , int k){

        int maxLength  = 0;

        int changes = 0;

        for(int i = 0 ; i< string.length() ; i++)
        {

            char [] hashMap = new char[26];
            int maxFrequency = 0;

             for(int j = i ; j< string.length() ; j++){

                     hashMap[string.charAt(j) -'A']++;

                 maxFrequency = Math.max(maxFrequency, hashMap[string.charAt(j) - 'A']); // Fix here

                     changes = (j-i+1) - maxFrequency;

                     if (changes <= k)
                         maxLength = Integer.max(maxLength,j-i+1);
                     else
                         break;
             }

        }

        return maxLength ;
    }

    public static int getMaxLongestRepeatingCharacter2(String s, int k) {
        int[] count = new int[26];
        int maxLength = 0, maxFreq = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // Window size - maxFrequency should not exceed k
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String [] args){

      String s = "AABABBA";

      int k = 2;

      System.out.println(getMaxLongestRepeatingCharacter1(s,k));
      System.out.println(getMaxLongestRepeatingCharacter2(s,k));



    }


}
