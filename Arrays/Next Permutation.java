class Solution {
    public void nextPermutation(int[] nums) {
         int n = nums.length;
         int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
           i--;
           }
         if (i >= 0) {
            int j = n - 1;
        while (j >= 0 && nums[j] <= nums[i]) {
…     }
       private void reverse(int[] nums, int start, int end) {
         while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
