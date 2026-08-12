class Solution {
    public int countValidPrefixes(String s) {
        int count0 = 0;
        int count1 = 0;
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                count0++;
            } else {
                count1++;
            }

            if (Math.abs(count0 - count1) <= 1) {
                ans++;
            }
        }

        return ans;
    }
}