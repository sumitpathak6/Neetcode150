package Stacks;
import java.util.*;
class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        Stack<Integer> stack = new Stack<>(); //initialize stack
        int n=heights.length;
        int[] leftsmall=new int[n]; //initialize left smaller value array
        int[] rightsmall = new int[n]; //initialize right smaller value array
        for(int i=0;i<n;i++)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                stack.pop();
            if(stack.isEmpty())
                leftsmall[i]=0;
            else
                leftsmall[i]=stack.peek()+1; //computing left smaller element
            stack.push(i);
        }
        while(!stack.isEmpty()) //empty the stack
        stack.pop();
        
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
                stack.pop();
            if(stack.isEmpty())
                rightsmall[i]=n-1;
            else
                rightsmall[i]=stack.peek()-1; //computing right smaller element using the same stack
            
            stack.push(i);
        }

        int maxArea = 0; //maximum area variable
        for(int i=0;i<n;i++) //computing the max area
        {
            maxArea = Math.max(maxArea , (heights[i] * (rightsmall[i]-leftsmall[i]+1))); //max_area = width * height of the histogram : width = rightsmaller - leftsmaller + 1
        }
        return maxArea;
    }
}