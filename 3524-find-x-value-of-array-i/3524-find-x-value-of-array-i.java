class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] a = new long[k];
        long[] b = new long[k];

        for (int c : nums) {
            long[] d = new long[k];
            int w = c % k;

            d[w]++;

            for (int f = 0; f < k; f++) {
                if (b[f] > 0) {
                    d[(f * w) % k] += b[f];
                }
            }

            for (int f = 0; f < k; f++) {
                a[f] += d[f];
            }

            b = d;
        }

        return a;
    }
}