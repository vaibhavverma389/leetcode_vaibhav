class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a=0;
        int b=matrix[0].length-1;
        while(a<matrix.length && b>=0)
        {
            if(matrix[a][b]==target)
            {
                return true;
            }
            else if(target<matrix[a][b])
            {
                b--;
            }
            else
            {
                a++;
            }

        }
        return false;
        
    }
}