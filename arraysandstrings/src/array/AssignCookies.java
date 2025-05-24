package array;

import java.util.Arrays;

public class AssignCookies {

    public static int findContentChildrenOptimise(int [] g , int [] s){

        int cookie = 0;
        int child = 0;

        Arrays.sort(g);
        Arrays.sort(s);

        while (child<g.length && cookie < s.length){

            if (s[cookie]>= g[child]){
                child++;
            }
            cookie++;

        }

        return child;
    }

    public  static int   findContentChildren(int[] g, int[] s) {
//
//        int []  g = {1,2};
//        int [] s = {1,2,3};

        boolean [] isSatified = new boolean[g.length];
        boolean [] isAssigned = new boolean[s.length];

         int count = 0;

         for (int i = 0 ; i< g.length ; i++){

             for (int j = 0 ; j< s.length ; j++){

                 if (s[j] >= g[i] && !isAssigned[j]){
                     count++;
                     isAssigned[j]=true;
                     break;
                 }

             }

         }

       return count;

    }

    public static void main(String [] args){
      int []  g = {1,2};
      int [] s = {1,2,3};
      System.out.println(findContentChildrenOptimise(g,s));;
    }

}
