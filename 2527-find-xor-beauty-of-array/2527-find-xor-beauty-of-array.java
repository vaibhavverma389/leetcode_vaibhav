class Solution {
    public int xorBeauty(int[] nums) {
        int n=0;
        for(int i:nums)
        {
            n=n^i;
        }
        return n;
        
    }
}