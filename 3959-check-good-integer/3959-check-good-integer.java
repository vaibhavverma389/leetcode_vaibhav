class Solution {
    public boolean checkGoodInteger(int n) {
        int digits=0;
        int digita=0;
        while(n>0)
        {
            int a=n%10;
            digits+=a;
            digita+=a*a;
            n/=10;
        }
        if(digita-digits <50)
        {
            return false;
        }
        return true;
        
    }
}