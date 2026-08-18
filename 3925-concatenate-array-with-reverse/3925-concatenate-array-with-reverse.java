class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] arr= new int[n*2];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        int a=n-1;
        for(int i=n;i<n*2;i++)
        {
            arr[i]=nums[a];
            a--;

        }
        return arr;
    }
}