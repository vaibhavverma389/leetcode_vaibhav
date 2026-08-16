class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr=new int[10];
        while(n>0)
        {
            int a= n%10;
            arr[a]++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<10;i++)
        {
            ans+=i*arr[i];
        }
        return ans;
        
    }
}