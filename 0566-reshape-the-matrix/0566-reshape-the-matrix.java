class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] ans=new int[r][c];
        int[] a=new int[r*c];
         int m = mat.length;        
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }
        int b=0;
        for(int[] i:mat)
        {
            for(int j:i)
            {
                a[b]=j;
                b++;
            }

        }    
        b=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=a[b];
                b++;
            }
        }
        return ans;    
    }
}