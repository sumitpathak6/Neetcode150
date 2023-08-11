package Stacks;

import java.util.*;
class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
            {
                int b = stack.pop();
                int a = stack.pop();
                int res = calc(a,b,s.charAt(0));
                stack.push(res);
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }   
        return stack.pop();
    }

    int calc(int a,int b,char op)
    {
        if(op=='+')
            return a+b;
        else if(op=='-')
            return a-b;
        else if(op=='*')
            return a*b;
        else
            return a/b;
    }
}