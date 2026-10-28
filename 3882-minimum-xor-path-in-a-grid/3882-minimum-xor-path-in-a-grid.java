class Solution {
    public int minCost(int[][] grid) {
        int b = grid.length;
        int c = grid[0].length;

        boolean[][][] d = new boolean[b][c][1024];
        d[0][0][grid[0][0]] = true;

        for (int e = 0; e < b; e++) {
            for (int f = 0; f < c; f++) {
                if (e == 0 && f == 0) continue;

                for (int g = 0; g < 1024; g++) {
                    if (e > 0 && d[e - 1][f][g]) {
                        d[e][f][g ^ grid[e][f]] = true;
                    }

                    if (f > 0 && d[e][f - 1][g]) {
                        d[e][f][g ^ grid[e][f]] = true;
                    }
                }
            }
        }

        for (int h = 0; h < 1024; h++) {
            if (d[b - 1][c - 1][h]) {
                return h;
            }
        }

        return 0;
    }
}