class Solution {
    int[] a;
    Random b;
    public Solution(int[] c)
    {
        a = c.clone();
        b = new Random();
    }
    public int[] reset() 
    {
        return a.clone();
    }
    public int[] shuffle() 
    {
        int[] c = a.clone();
        for (int d = c.length - 1; d > 0; d--) 
        {
            int e = b.nextInt(d + 1);
            int f = c[d];
            c[d] = c[e];
            c[e] = f;
        }
        return c;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */