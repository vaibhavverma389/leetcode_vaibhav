class Solution {
    public int[] resultArray(int[] a) {
        int n = a.length;

        int[] b = new int[n];
        int[] c = new int[n];

        int d = 1;
        int e = 1;

        b[0] = a[0];
        c[0] = a[1];

        for (int f = 2; f < n; f++) {
            if (b[d - 1] > c[e - 1]) {
                b[d++] = a[f];
            } else {
                c[e++] = a[f];
            }
        }

        int[] g = new int[n];

        for (int f = 0; f < d; f++) {
            g[f] = b[f];
        }

        for (int f = 0; f < e; f++) {
            g[d + f] = c[f];
        }

        return g;
    }
}