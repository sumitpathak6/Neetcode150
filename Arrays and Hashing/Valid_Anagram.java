class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length()!=t.length())
            return false;
        int n=s.length();
        int freq[]=new int[26];
        for(int i=0;i<n;i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int j=0;j<n;j++)
        {
            freq[t.charAt(j)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(freq[i]!=0)
                return false;
        }        
        return true;
    }
}