import java.util.*;
class Solution {
    public int[] replaceElements(int[] arr) {
        int prevMax=-1;
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            int newMax = Math.max(arr[i],prevMax);
            arr[i]=prevMax;
            prevMax=newMax;
        }
        return arr;
    }
}