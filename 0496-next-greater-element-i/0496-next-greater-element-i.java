class Solution {

public int next(int j,int i,int[] nums2)
{
    for(int k=i;k<nums2.length;k++)
    {
        if(nums2[k]>j)
        {
            return nums2[k];
        }
    }
    return -1;

} 
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans= new int[nums1.length];
        int a=0;
        for(int j:nums1)
        {
            for(int i=0;i<nums2.length;i++)
            {
                if(j==nums2[i])
                {
                    ans[a]=next(j,i,nums2);
                    i++;
                }
            }
        }
        return ans;
        
    }
}