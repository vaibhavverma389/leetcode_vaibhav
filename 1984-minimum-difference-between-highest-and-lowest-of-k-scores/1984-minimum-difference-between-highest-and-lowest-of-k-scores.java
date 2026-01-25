class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int a = Integer.MAX_VALUE;

        for (int i = 0; i - 1 < nums.length-k; i++) {
            a = Math.min(a, nums[i + k - 1] - nums[i]);
        }

        return a;
    }
}