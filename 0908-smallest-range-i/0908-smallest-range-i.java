class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];        
        for (int num : nums) 
        {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }        
        int diff = max - min;
        if (diff <= 2 * k) return 0;
        return diff - 2 * k;
    }
}