class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int n=nums.length;
        int max=0;
        for(int i:nums)
        {
            if(i>max)
            {
                max=i;
            }
            sum+=i;
        }
        return (n*max)-sum;
        
    }
}