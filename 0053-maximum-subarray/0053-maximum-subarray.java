class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i:nums)
        {
            currSum+=i;
            if(currSum>maxSum)
            {
                maxSum=currSum;
            }
            if(currSum<0)
            {
                currSum=0;
            }

        }
        return maxSum;
    }
}
