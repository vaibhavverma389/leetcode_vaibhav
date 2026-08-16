class Solution {
    public int minimumSwaps(int[] nums) {
        int zeros = 0;

        for (int x : nums) {
            if (x == 0) {
                zeros++;
            }
        }

        int ans = 0;
        int end = nums.length - zeros;

        for (int i = 0; i < end; i++) {
            if (nums[i] == 0) {
                ans++;
            }
        }

        return ans;
    }
}