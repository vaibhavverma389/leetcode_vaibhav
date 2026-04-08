class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int a = 0;
        int b = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            b += nums[i];

            while (b >= target) {
                min = Math.min(min, i - a + 1);
                b -= nums[a];
                a++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}