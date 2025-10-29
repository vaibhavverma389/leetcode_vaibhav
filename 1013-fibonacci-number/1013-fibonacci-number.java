class Solution {
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        if(n==2)
        {
            return 1;
        }
        int c=0;
        int p1=1;
        int p2=1;
        for(int i=3;i<=n;i++)
        {
            c=p1+p2;
            p1=p2;
            p2=c;
        }
        return c;
    }
}