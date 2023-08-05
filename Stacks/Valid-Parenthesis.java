package Stacks;

import java.util.*;
class Solution 
{
    public boolean isValid(String s) 
    {
        if(s.length()%2!=0)return false; //if length is not even it cannot be valid
        Stack<Character> stack = new Stack<>(); //initialize stack
        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty() && (s.charAt(i)== ')' || s.charAt(i)=='}' || s.charAt(i)=='}')) //stack has just closing paranthesis
            {
                return false;
            }
            else
            {
                if(!stack.isEmpty())
                {
                    if(stack.peek()=='(' && s.charAt(i)==')') //checking for closing bracket
                        stack.pop();
                    else if(stack.peek()=='[' && s.charAt(i)==']') //checking for closing bracket
                        stack.pop();
                    else if(stack.peek()=='{' && s.charAt(i)=='}') //checking for closing bracket
                        stack.pop();
                    else
                        stack.add(s.charAt(i)); //adding opening parenthesis 
                }
                else
                {
                    stack.add(s.charAt(i)); //adding opening parenthesis
                }
            }
        }
        return stack.isEmpty();
    }
}