import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {

            int diff = target-nums[i];
            if(map.containsKey(diff)==false)
            {
                map.put(nums[i],i);
            }
            else
            {
                ans[0]=i;
                ans[1]=map.get(target-nums[i]);
            }
        }
        return ans;
    }
}