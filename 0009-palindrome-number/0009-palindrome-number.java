class Solution {
    public boolean isPalindrome(int x) {
        int c=0;
        int d=x;
        while (x > 0) {
            int b = x % 10;
            c = c*10+b;
            x = x / 10;
        }
        if (c==d){
            return true;

        }
        else{
            return false; 
        }
    }
}