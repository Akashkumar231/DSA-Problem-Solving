import java.util.Stack;

public class LongestValidParenthesis {


    public static int longestValidParentheses(String string) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int validCount = 0 ;

        for(int i  = 0 ; i< string.length() ; i++){

            if(string.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    validCount = Math.max(validCount ,  i-stack.peek());
                }
            }

        }
        return validCount;
    }

    private static int maxCount = 0;

    public static void generate(String string , int start , int end){

        if (end > string.length()){
            return;
        }

        String subString = string.substring(start,end);

        if (isValidSubString(string)){
            maxCount = Math.max(maxCount,string.length());
        }

        generate(string,start,end+1);

    }

    public static boolean isValidSubString(String string){

        Stack<Character> stack = new Stack<>();

        for (int index = 0 ; index < string.length() ; index++)
        {
            if (string.charAt(index) =='('){
                stack.push(string.charAt(index));
            }else{

                if (stack.isEmpty())
                    return false;
                stack.pop();
            }
        }

       return stack.isEmpty();

    }

    public static int getLongestValidParenthesesRecursion(String string){

        for (int start = 0 ; start< string.length() ; start++){
            generate(string,start,start+1);
        }

        return maxCount;

    }

    public static int getlongestValidParentheses(String s) {

        // Edge case
        if (s == null || s.length() < 2) {
            return 0;
        }

        /*
         * dp[i] = length of longest valid parentheses
         * substring ending at index i
         */
        int[] dp = new int[s.length()];

        // Stores final maximum answer
        int maxLength = 0;

        // Start from index 1 because we always check i-1
        for (int i = 1; i < s.length(); i++) {

            // We only process when current character is ')'
            if (s.charAt(i) == ')') {

                /*
                 * CASE 1
                 *
                 * Current pattern is "()"
                 *
                 * Example:
                 * index : 0 1
                 * chars : ( )
                 */

                if (s.charAt(i - 1) == '(') {

                    /*
                     * Add 2 for current "()"
                     *
                     * Also add dp[i-2]
                     * because there may be a valid substring before it.
                     *
                     * Example:
                     * "()()"
                     *
                     * At i = 3:
                     * dp[3] = dp[1] + 2
                     *       = 2 + 2
                     *       = 4
                     */

                    dp[i] = 2;

                    if (i >= 2) {
                        dp[i] += dp[i - 2];
                    }
                }

                /*
                 * CASE 2
                 *
                 * Current character is ')'
                 * Previous character is also ')'
                 *
                 * Example:
                 * "(())"
                 * "()(())"
                 */

                else {

                    /*
                     * Find possible matching '('
                     *
                     * We jump backward using previous valid length.
                     *
                     * Formula:
                     * i - dp[i-1] - 1
                     *
                     * Example:
                     * "()(())"
                     *
                     * At i = 5:
                     *
                     * dp[4] = 2
                     *
                     * matchingIndex
                     * = 5 - 2 - 1
                     * = 2
                     */

                    int matchingIndex = i - dp[i - 1] - 1;

                    /*
                     * Check:
                     * 1. index should be valid
                     * 2. character should be '('
                     */

                    if (matchingIndex >= 0 &&
                            s.charAt(matchingIndex) == '(') {

                        /*
                         * Add:
                         *
                         * previous valid block
                         * + current matching "()"
                         */

                        dp[i] = dp[i - 1] + 2;

                        /*
                         * Also connect previous valid substring
                         * if it exists.
                         *
                         * Example:
                         * "()(())"
                         *
                         * after matching "(())",
                         * also connect previous "()"
                         */

                        if (matchingIndex > 0) {

                            dp[i] += dp[matchingIndex - 1];
                        }
                    }
                }

                // Update global maximum answer
                maxLength = Math.max(maxLength, dp[i]);
            }
        }

        return maxLength;
    }



    public static void main(String [] args){

       /* String string = "(())()()";
        System.out.println(getLongestValidParenthesesRecursion(string));
        System.out.println(getlongestValidParentheses(string));*/



    }

}
