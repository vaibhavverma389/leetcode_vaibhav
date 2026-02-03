class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length];
        for(int j=0;j<nums1.length;j++)
        {
            boolean a=false;
            for(int i=0;i<nums2.length;i++)
            {
                if(nums1[j]==nums2[i])
                {
                    a=true;

                }
                arr[j]=-1;
                if(a && nums2[i]>nums1[j])
                {
                    arr[j]=nums2[i];
                    break;
                }
            }
           
        }
        return arr;
        
    }
}