class Solution {
    public int[] productExceptSelf(int[] nums) {

        int sum=1;
        int n=nums.length;
        int[] preFix=new int[n];
        int[] postFix=new int[n];
        int pre=1;
        int post =1;
        for(int i=0;i<n;i++)
        {
            pre*=nums[i];
            preFix[i]=pre;
        }
        for(int i=n-1;i>=0;i--)
        {
            post*=nums[i];
            postFix[i]=post;
        }
        nums[0]=postFix[1];
        nums[n-1]=preFix[n-2];
        for(int i=1;i<n-1;i++)
        {
            nums[i]=preFix[i-1]*postFix[i+1];
        }
        return nums;

       
        
    }
}