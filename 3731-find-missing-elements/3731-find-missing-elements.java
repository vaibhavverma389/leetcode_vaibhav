class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer>  al= new ArrayList<>();
        Arrays.sort(nums);
        int a=nums[0];
        int j=0;
        int b=nums[nums.length-1];
        for(int i=a;i<b;i++)
        {
            if(i == nums[j])
            {
                j++;
            }
            else
            {
                al.add(i);
            }
        }
        return al;
    }
}