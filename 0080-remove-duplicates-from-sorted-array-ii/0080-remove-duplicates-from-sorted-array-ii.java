class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 2; 
        for (int i = 2; i < nums.length; i+=1) 
        {
            if (nums[k-2] != nums[i]) 
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}