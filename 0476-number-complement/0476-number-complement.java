class Solution {
    public int findComplement(int num) {
        if(num==0)
        {
            return 1;
        }
        int a=0;
        int b=num;;
        while(b>0)
        {
            a= (a<< 1) | 1;
            b >>= 1;
        }
        return a ^ num;
        
    }
}