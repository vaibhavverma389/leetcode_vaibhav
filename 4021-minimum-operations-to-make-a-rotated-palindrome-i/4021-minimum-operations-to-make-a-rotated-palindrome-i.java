class Solution {
    public int minOperations(String s) {
        int n = s.length();
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k < n; k++) {
            int operations = k;
            for (int i = 0; i < n / 2; i++) {
                int left = (i + k) % n;
                int right = (n - 1 - i + k) % n;
                int a = s.charAt(left) - 'a';
                int b = s.charAt(right) - 'a';
                int diff = Math.abs(a - b);
                operations += Math.min(diff, 26 - diff);
            }
            ans = Math.min(ans, operations);
        }
        return ans;
    }
}