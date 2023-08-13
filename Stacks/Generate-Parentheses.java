package Stacks;
import java.util.*;
class Solution 
{
    Stack<Character> stack = new Stack<>();
    ArrayList<String> res  = new ArrayList<>(); //initialize the result list
    public List<String> generateParenthesis(int n) 
    {
        backtrack(res,"",0,0,n); //backtracking call
        return res;
    }
    public void backtrack(List<String> list,String temp,int openN,int closeN,int n)
    {
        if(temp.length() == n*2) //checking for complete parenthesis pair
        {
            list.add(temp); //adding the pair to the answer list
            return;
        }
        
        if(openN<n)
        {
            
            backtrack(list,temp+"(",openN+1,closeN,n); //backtracking for open parenthesis and incrementing the number of open parenthesis count for 1
            
        }
        if(openN>closeN)
        {
            
            backtrack(list,temp+")",openN,closeN+1,n); //backtracking for closing parenthesis and incrementing the number of closing parenthesis count for 1
            
        }
    }
}