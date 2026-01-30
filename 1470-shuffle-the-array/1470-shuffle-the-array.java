class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[n*2];
        for(int i=0;i<n*2;i=i+2)
        {
            arr[i]=nums[i/2];
        }
        for(int i=1;i<n*2;i=i+2)
        {
            int temp=i/2+n;
            arr[i]=nums[temp];
        }
        return arr;
        
        
    }
}