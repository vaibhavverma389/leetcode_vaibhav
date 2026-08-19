class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] subCount = new int[51];
        int n = nums.length;        
        for (int i = 0; i <= n - k; i++) {
            boolean[] seenInCurrentSubarray = new boolean[51];
            for (int j = i; j < i + k; j++) {
                seenInCurrentSubarray[nums[j]] = true;
            }
            for (int num = 0; num <= 50; num++) {
                if (seenInCurrentSubarray[num]) {
                    subCount[num]++;
                }
            }
        }
        int maxAlmostMissing = -1;
        for (int num = 0; num <= 50; num++) {
            if (subCount[num] == 1) {
                maxAlmostMissing = Math.max(maxAlmostMissing, num);
            }
        }
        
        return maxAlmostMissing;
    }
}