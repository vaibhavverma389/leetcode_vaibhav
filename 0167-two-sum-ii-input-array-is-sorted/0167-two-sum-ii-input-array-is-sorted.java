class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i=0;
        int j=numbers.length-1;
        int[] b=new int[2];
        while(i<j)
        {
            int a=numbers[i]+numbers[j];
            if(a==target)
            {
                b[0]=i+1;
                b[1]=j+1;
                return b;
            }
            else if(a<target)
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return b;

    }
}