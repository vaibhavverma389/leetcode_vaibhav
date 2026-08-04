class Solution {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long ans = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                long g = gcd(nums[i], nums[j]);
                long a = ((long) nums[i] * nums[j]) / (g * g);
                ans = Math.max(ans, a);
            }
        }

        return ans;
    }
}