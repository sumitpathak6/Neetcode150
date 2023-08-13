package Stacks;

import java.util.*;
class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<>(); //creating a stack
        for(String s:tokens)
        {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) //checking for operators
            {
                int b = stack.pop();
                int a = stack.pop();
                int res = calc(a,b,s.charAt(0)); //calculating the result based on the operator
                stack.push(res); //pushing the result onto the stack
            }
            else
            {
                stack.push(Integer.parseInt(s)); //pushing the operands onto the stack
            }
        }   
        return stack.pop();
    }

    int calc(int a,int b,char op) //evaluating arithmetic operations 
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