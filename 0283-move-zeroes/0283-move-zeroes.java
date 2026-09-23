class Solution {

    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int lastNonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex++] = nums[i];
            }
        }

        while (lastNonZeroIndex < n) {
            nums[lastNonZeroIndex++] = 0;
        }
    }
}