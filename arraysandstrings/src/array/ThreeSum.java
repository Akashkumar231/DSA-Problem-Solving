package array;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum1(int[] nums){

        List<List<Integer>> ansList = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i< nums.length;i++){
            for (int j = i+1 ; j<nums.length ; j++){
                for (int k = j+1 ; k<nums.length ; k++){
                    if (  nums[i]+nums[j]+nums[k]==0){
                       List<Integer> list =new ArrayList<>();
                       list.add(nums[i]);
                       list.add(nums[j]);
                       list.add(nums[k]);
                       Collections.sort(list);
                       set.add(list);
                    }
                }
            }
        }
        Iterator<List<Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            ansList.add(iterator.next());
        }
        return ansList;
    }

    public static List<List<Integer>> threeSum2(int [] nums){
        Set<List<Integer>> hashSet =new HashSet<>();
        for (int i = 0 ; i< nums.length ; i++){
            Set<Integer> elements = new HashSet<>();
            for (int j = i+1 ; j<nums.length ; j++){
                int thirdElement = -(nums[i]+nums[j]);
                if (elements.contains(thirdElement)){
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[j]);
                    arrayList.add(thirdElement);
                    Collections.sort(arrayList);
                    hashSet.add(arrayList);
                }
                elements.add(nums[j]);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        Iterator<List<Integer>> listIterator = hashSet.iterator();
        while (listIterator.hasNext()){
            list.add(listIterator.next());
        }
        return list;
    }

    public static List<List<Integer>> threeSum3(int [] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0 ; i< nums.length ; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j = i + 1 ;
            int k = nums.length -1;
            while (j<k){
                int sum  = nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j<k && nums[j] == nums[j-1]) j++;
                    while (j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

    public static void main(String [] args){

        int [] nums = new int []{-1,0,1,2,-1,-4};

        List<List<Integer>> ans= threeSum3(nums);

        for (List<Integer> integers : ans){
            System.out.println(integers);
        }

    }

}
