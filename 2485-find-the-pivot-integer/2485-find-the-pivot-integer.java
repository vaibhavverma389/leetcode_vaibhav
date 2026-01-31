class Solution {
    public int pivotInteger(int n) {
        int a=n*(n+1)/2;
        for(int i=1;i<=n;i++)
        {
            int temp=i*(i+1)/2;
            if(a+i==temp*2)
            {
                return i;
            }
        }
        return -1;
        
    }
}