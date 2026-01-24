class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix.length-1;
        int n=matrix[0].length;
        while(j>=0 && i<n)
        {
            if(matrix[j][i]==target)
            {
                return true;
            }
            else if(matrix[j][i]>target)
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return false;
        
    }
}