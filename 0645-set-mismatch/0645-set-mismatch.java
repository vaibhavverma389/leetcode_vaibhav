class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        
        int a = -1, b = -1;
        
        for (int num : nums) {
            arr[num]++;
            if (arr[num] == 2) {
                a = num;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) {
                b = i;
                break;
            }
        }
        
        return new int[]{a, b};
    }
}
