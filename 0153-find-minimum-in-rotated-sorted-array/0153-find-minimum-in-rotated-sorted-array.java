class Solution {
    public int findMin(int[] nums) {
        int a=0;
        int b=nums.length -1;
        while( a<b)
        {
            int mid= a + (b-a)/2;
            if(nums[mid]>nums[b])
            {
                a= mid+1;
            }
            else
            {
                b=mid;
            }
        }
        return nums[a];

    }
}