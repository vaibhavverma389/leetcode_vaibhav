class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int i=0;
        int j=height.length-1;
        while(j>i)
        {
            int b=j-i;
            int c=b*(Math.min(height[i],height[j]));
            if(ans<c)
            {
                ans=c;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        
        return ans;
    }
}