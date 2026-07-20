class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int a = grid.length;
        int b = grid[0].length;
        int c = a * b;
        k %= c;
        List<List<Integer>> ans = new ArrayList<>();
        for (int d = 0; d < a; d++) {
            ans.add(new ArrayList<>());
            for (int e = 0; e < b; e++) {
                int f = d * b + e;
                int g = (f - k + c) % c;
                int h = g / b;
                int i = g % b;
                ans.get(d).add(grid[h][i]);
            }
        }
        return ans;
    }
}