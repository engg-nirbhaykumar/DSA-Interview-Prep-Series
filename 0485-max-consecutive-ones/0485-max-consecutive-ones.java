class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int currentStreak = 0;
        int maxStreak = 0;

        for (int num : nums) {
            if (num == 1) {
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }

        return maxStreak;
    }
}