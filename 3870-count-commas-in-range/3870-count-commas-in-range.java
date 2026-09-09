class Solution {
    public int countCommas(int n) {
        // count digits from 1,000 to 100,000
        return Math.max(0, n - 1000 + 1);
    }
}