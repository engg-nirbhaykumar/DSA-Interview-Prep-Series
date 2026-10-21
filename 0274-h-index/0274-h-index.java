class Solution {

    public int hIndex(int[] citations) {
        // Sort in descending order [sort asc + traverse from end index]
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;

        // Traverse from highest citation down
        for (int i = n - 1; i >= 0; i--) {
            int papers = n - i; // how many papers we've seen so far
            if (citations[i] >= papers) {
                h = papers;
            } else {
                break; // no longer satisfies h-index condition
            }
        }

        return h;
    }
}
