// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach:
/*
When at first or last column add 1
else get i-1,j-1 and i-1,j elements add and store them
*/
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result= new ArrayList<>();
        if(numRows==0) return result;

        for(int i=0;i<numRows;i++){
            int rowSize= i+1;
            List<Integer> row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i) row.add(1);
                else{
                    int left= result.get(i-1).get(j-1);
                    int right= result.get(i-1).get(j);
                    row.add(left+right);
                }
            }
            result.add(row);
        }

        return result;
    }

}
