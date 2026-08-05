class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;

        int b = 0;
        int a = n;

        while (a > 0) {
            b = (b << 1) | 1;
            a >>= 1;
        }

        return n ^ b;
    }
}