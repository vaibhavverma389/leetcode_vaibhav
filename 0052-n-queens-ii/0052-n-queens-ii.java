class Solution {
    int a = 0;
    public int totalNQueens(int n) {
        boolean[] b = new boolean[n];
        boolean[] c = new boolean[2 * n];
        boolean[] d = new boolean[2 * n];
        solve(0, n, b, c, d);
        return a;
    }
    void solve(int e, int n, boolean[] b,
               boolean[] c, boolean[] d) {
        if (e == n) {
            a++;
            return;
        }
        for (int f = 0; f < n; f++) {
            int x = e - f + n;
            int y = e + f;
            if (b[f] || c[x] || d[y]) {
                continue;
            }
            b[f] = true;
            c[x] = true;
            d[y] = true;
            solve(e + 1, n, b, c, d);
            b[f] = false;
            c[x] = false;
            d[y] = false;
        }
    }
}