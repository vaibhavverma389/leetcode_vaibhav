class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int[] blocks = new int[101];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                blocks[nums[i]]++;
            }
        }
        int ans = 0;
        for (int x = 1; x <= 100; x++) {
            if (freq[x] > 0 && blocks[x] == 1) {
                ans++;
            }
        }
        return ans;
    }
}