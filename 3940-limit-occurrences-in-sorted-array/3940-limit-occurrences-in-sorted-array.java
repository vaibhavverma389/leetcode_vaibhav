class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] ans = new int[nums.length];
        int j = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                count = 0;
            }
            if (count < k) {
                ans[j++] = nums[i];
                count++;
            }
        }
        return Arrays.copyOf(ans, j);
    }
}