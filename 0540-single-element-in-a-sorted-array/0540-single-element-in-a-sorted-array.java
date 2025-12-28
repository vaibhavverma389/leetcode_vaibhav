class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int last = nums.length - 1;

        while (start < last) {
            int mid = start + (last - start) / 2;

           
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                last = mid;
            }
        }

        return nums[start];
    }
}
