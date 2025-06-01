package array;

import java.util.*;

public class FourSum {

    public static List<List<Integer>> getFourSum1(int [] nums){

        Set<List<Integer>> hashSet = new HashSet<>();
        List<List<Integer>> listOfSets = new ArrayList<>();

        for(int i = 0; i < nums.length ; i++){

            for (int j = i+1 ; j<nums.length ; j++){

                 for(int k = j+1 ; k<nums.length ; k++){

                     for (int l = k+1 ; l<nums.length ; l++){

                         if (nums[i]+nums[j]+nums[k]+nums[l]==0){
                             ArrayList<Integer> temp = new ArrayList<>();
                             temp.add(nums[i]);
                             temp.add(nums[j]);
                             temp.add(nums[k]);
                             temp.add(nums[l]);
                             Collections.sort(temp);
                             hashSet.add(temp);
                         }
                     }
                 }
            }
        }
        Iterator<List<Integer>> iterator = hashSet.iterator();
          while (iterator.hasNext()){
             listOfSets.add(iterator.next());
          }

      return listOfSets;

    }

    public static List<List<Integer>> getFourSum2(int [] nums){

        List<List<Integer>> listOfSets = new ArrayList<>();

        Set<List<Integer>> hashSet = new HashSet<>();
        for(int i = 0; i < nums.length ; i++){

            for (int j = i+1 ; j<nums.length ; j++){

                Set<Long> storeElements = new HashSet<>();

                for(int k = j+1 ; k<nums.length ; k++){

                     long sum = nums[i]+nums[j];
                     sum+=nums[k];
                    long element = -sum;
                     if (storeElements.contains(element))
                     {
                         List<Integer> ans = new ArrayList<>();
                         ans.add(nums[i]);
                         ans.add(nums[j]);
                         ans.add(nums[k]);
                         ans.add((int)element);
                         Collections.sort(ans);
                         hashSet.add(ans);
                     }

                     storeElements.add((long)nums[k]);
                }
            }
        }
        Iterator<List<Integer>> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            listOfSets.add(iterator.next());
        }

         while (iterator.hasNext()){
         listOfSets.add(iterator.next());
            }
        return listOfSets;

    }

    public static List<List<Integer>> getFourSum3(int [] nums , int target){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> anslist =new ArrayList<>();
        for (int i = 0 ; i< n ; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i+1 ; j<n ; j++){
                if (j!=i+1 && nums[j]==nums[j-1])continue;
                int k = j+1;
                int l = n-1;
                while (k<l){
                    long sum = nums[i]+nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if (sum==target){
                        List<Integer> arraylist = new ArrayList<>();
                        arraylist.add(nums[i]);
                        arraylist.add(nums[j]);
                        arraylist.add(nums[k]);
                        arraylist.add(nums[l]);
                        anslist.add(arraylist);
                        k++;
                        l--;
                        while (k<l && nums[k] == nums[k-1]) k++;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return anslist;
    }

    public static void main(String [] args){

        int [] nums= new int[]{1,0,-1,0,-2,2};

        List<List<Integer>> arrayList = getFourSum3(nums,0);
        for(List<Integer> list : arrayList){
            System.out.println(list);
        }

    }

}
