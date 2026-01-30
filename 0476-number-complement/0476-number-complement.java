class Solution {
    public int findComplement(int num) {
        int full = 0;
        int temp = num;

        while (temp > 0) {
            full = (full << 1) | 1;
            temp >>= 1;
        }

        return (~num) & full;
        
    }
}