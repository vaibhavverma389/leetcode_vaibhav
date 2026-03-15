class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int j=n-k+1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<j;i++)
        {
            int sum=0;
            for(int m=0;m<k;m++)
            {
                sum += nums[i+m];
            }
            ans=Math.max(ans,sum);
        }
        return (double) ans/k;

        
    }
}