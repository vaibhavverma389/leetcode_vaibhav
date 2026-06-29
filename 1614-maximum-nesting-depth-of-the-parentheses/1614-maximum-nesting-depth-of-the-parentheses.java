class Solution {
    public int maxDepth(String s) {
        int n= s.length();
        int a=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if( s.charAt(i)=='(')
            {
                a++;
                ans= Math.max(a,ans);
            }
            if(s.charAt(i)==')')
            {
                a--;
            }

        }
        return ans;

    }
}