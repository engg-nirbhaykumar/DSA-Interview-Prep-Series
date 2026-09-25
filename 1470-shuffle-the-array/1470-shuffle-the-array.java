class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = 2 * n;
        int left = 0;
        int right = n;
        int[] ans = new int[size];

        for (int i = 0; i < size; i++) {
            ans[i] = nums[left++];
            i++;
            ans[i] = nums[right++];
        }
        return ans;
    }
}