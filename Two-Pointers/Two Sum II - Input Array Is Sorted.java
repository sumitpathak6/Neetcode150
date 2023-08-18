class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a_pointer=0; //left pounter 
        int b_pointer=numbers.length-1; //right pointer
        while(a_pointer<=b_pointer)
        {
            int sum=numbers[a_pointer]+numbers[b_pointer]; //sum of the elements at both the left and right pointers
            if(sum<target)
            {
                a_pointer++; //incrementing the left pointer
            }
            else if(sum>target)
            {
                b_pointer--; //decrementing the right pointer
            }
            else
            return new int[] {a_pointer+1,b_pointer+1}; //if sum == sum of elements at the right and left pointers, return the indices
        }
    }
}