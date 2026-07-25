class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int a=nums.length;
        if(a==1)
        {
            return true;
        }
        int b=a/2;
        int c=nums[b];
        int d=0;
        for(int i:nums)
        {
            if(i==c)
            {
                d++;
            }
        }
        if(d==1)
        {
            return true;
        }
        return false;
        
    }
}