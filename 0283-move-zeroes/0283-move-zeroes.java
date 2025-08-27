class Solution {
    public void moveZeroes(int[] nums) {
        

        int[] arr=new int[nums.length];
        int j=0;
        int g=0;
        for(int k=0;k<nums.length;k++)
        {
            arr[k]=0;
        }
        for(int i=0;i<nums.length;i++)
        {
            if (nums[i]!=0)
            {
                arr[j]=nums[i];
                j++;
            }
        }
        for(int m:arr)
        {
            nums[g]=m;
            g++;
        }

        
        
    }
}