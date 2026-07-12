class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false;
        }
        int t = totalSum / 2;
        boolean[] dp = new boolean[t + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = t; j >= num; j--) {
                if (dp[j - num]) {
                    dp[j] = true;
                }
            }
            if (dp[t]) {
                return true;
            }
        }
        
        return dp[t];
        
    }
}