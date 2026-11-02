class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int result = nums[nums.length / 2];
        int ans=0;

        for(int i:nums)
        {
            int a = Math.abs(i-result);
            ans=ans+a;
        }
        return ans;
        
    }
}