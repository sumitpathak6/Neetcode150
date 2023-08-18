
class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int i=0,j=n-1; //initializing the pointers
        while(i<j)
        {
            char begin = s.charAt(i); //character at starting pointer
            char end = s.charAt(j); //character at ending pointer
            if(!Character.isLetterOrDigit(begin)) //filtering spaces and all other unwanted elements
            {
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)) //filtering spaces and all other unwanted elements
            {
                j--;
                continue;
            }
            if(Character.toLowerCase(begin) != Character.toLowerCase(end))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}