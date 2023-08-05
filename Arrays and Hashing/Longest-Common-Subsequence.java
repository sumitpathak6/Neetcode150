import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        int count=1;
        HashSet<Integer> set = new HashSet<>(); //creating the set
        int ans=1;
        for(int num:nums)
        {
            set.add(num); //adding the elements to the set
        }
        for(int num:nums)
        {
            if(!set.contains(num-1)) //checking if the element is the first element of a sequence
            {
                count=1;
                while(set.contains(num+1)) //checking for the next element of a sequence
                {
                    count++; //length of the sequence
                    num++;
                }
            }
            ans=Math.max(ans,count); //calculating the longest sequence
        }
    return ans;
    }
}