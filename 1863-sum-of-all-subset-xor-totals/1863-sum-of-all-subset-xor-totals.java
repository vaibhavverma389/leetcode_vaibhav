class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }
    private int solve(int[] nums, int i, int currXor) {
        if (i == nums.length) {
            return currXor;
        }
        int a = solve(nums, i + 1, currXor ^ nums[i]);
        int b = solve(nums, i + 1, currXor);
        return a + b;
    }
}