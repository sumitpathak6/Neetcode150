import java.util.*;
class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {   
        List<List<Integer>> res = new ArrayList<>();
        for(int i=-0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i) //edge cases to be 1
                {
                    row.add(1);
                }
                else
                {
                    row.add(res.get(i-1).get(j) + res.get(i-1).get(j-1)); //calculating the value of pascal number for the particular index
                }
            }
            res.add(row);

        }
        return res;        
    }
}