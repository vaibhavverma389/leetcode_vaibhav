class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        int[] a = new int[n + 1];
        int top = 0;
        a[0] = -1;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                a[++top] = i;
            } else {
                top--;
                if (top < 0) {
                    top = 0;
                    a[0] = i;
                } else {
                    ans = Math.max(ans, i - a[top]);
                }
            }
        }
        return ans;
    }
}