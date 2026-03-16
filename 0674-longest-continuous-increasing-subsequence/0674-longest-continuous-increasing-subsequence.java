class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int sum=0;
        int ans=0;
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int a=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                sum++;
                ans=Math.max(ans,sum);
            }
            else
            {
                sum=0;
            }
        }
        return ans+1;

        
    }
}