import java.util.*;
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int pre=1,pro=1;
        int n=nums.length;
        int prefix[]=new int[n]; // prefix array
        int postfix[]=new int[n]; // postfix array
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            prefix[i]=pre;
            pre*=nums[i]; // product of prefix elements
        }
        for(int i=n-1;i>=0;i--)
        {
            postfix[i]=pro;
            pro*=nums[i]; // product of postfix elements
        }
        for(int i=0;i<n;i++)
        {
            res[i]=prefix[i]*postfix[i]; //computation of product of prefix elements and postfix elements
        }
        return res;
    }
}