class Solution {

    public int thirdMax(int[] nums) {
        long maxm1 = Long.MIN_VALUE;
        long maxm2 = Long.MIN_VALUE;
        long maxm3 = Long.MIN_VALUE;

        for (int num : nums) {

            if (num == maxm1 || num == maxm2 || num == maxm3) {
                continue;
            }
            if (num > maxm1) {
                maxm3 = maxm2;
                maxm2 = maxm1;
                maxm1 = num;
            } else if (num > maxm2) {
                maxm3 = maxm2;
                maxm2 = num;
            } else if (num > maxm3) {
                maxm3 = num;
            }
        }

        return maxm3 == Long.MIN_VALUE ? (int) maxm1 : (int) maxm3;
    }
}