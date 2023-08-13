package Stacks;
import java.util.*;
class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int [] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<Integer>(); //initialize stack
        for(int current_day=0;current_day<temperatures.length;current_day++) //iterate through current temperature
        {
            while(!stack.isEmpty() && temperatures[current_day]>temperatures[stack.peek()]) //check if current temperature is higher than temperature at the top of stack
            {
                int previous_day = stack.pop();
                ans[previous_day] = current_day-previous_day; //calculating the difference between days
            }
            
            
                stack.push(current_day); //pushing the current temperature if it is lower than the temperature at the top of stack
            
        }
        return ans;
    }
}
