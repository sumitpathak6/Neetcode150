package Backtracking;
import java.util.*;
class Solution 
{
    Stack<Character> stack = new Stack<>();
    ArrayList<String> res  = new ArrayList<>();
    public List<String> generateParenthesis(int n) 
    {
        backtrack(res,"",0,0,n);
        return res;
    }
    public void backtrack(List<String> list,String temp,int openN,int closeN,int n)
    {
        if(temp.length() == n*2)
        {
            list.add(temp);
            return;
        }
        
        if(openN<n)
        {
            
            backtrack(list,temp+"(",openN+1,closeN,n);
            
        }
        if(openN>closeN)
        {
            
            backtrack(list,temp+")",openN,closeN+1,n);
            
        }
    }
}