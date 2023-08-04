import java.util.*;
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int res[]=new int[k]; //making the resultant array
 
        Map<Integer,Integer> count = new HashMap<>(); //creating the frequency hashmap
        ArrayList<Integer> bucket[] = new ArrayList[nums.length+1]; //creating the bucket array to map frequencies and elements

        for(int num : nums)
        {
            count.merge(num,1,Integer::sum); //mapping frequencies
        }
        for(int key : count.keySet())
        {
            int freq = count.get(key);
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>(); //adding the elements to its frequencies in the bucket array
            }
            bucket[freq].add(key);
        }

        int index=0;
        for(int i=nums.length;i>=0;i--) //iterating backwards to check k most frequent elements
        {
            if(bucket[i]!=null)
            {
                for(int val:bucket[i])
                {
                    res[index++]=val;
                    if(index==k) //comparing if we have reached k elements
                    return res;
                }
            }
        }
        return res;
    }
}