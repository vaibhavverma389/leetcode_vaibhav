class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int a = nums.length;
        if (a <= 2) return a;
        int b = 1;
        while (b <= a) {
            b <<= 1;
        }
        return b;
    }
}