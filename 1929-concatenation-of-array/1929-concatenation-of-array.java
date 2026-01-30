class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a=n*2;
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            int temp =i%n;
            arr[i]=nums[temp];
        }
        return arr;
        
    }
}