class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        int totalGas = 0;
        int totalCost = 0;

        // Calculate total gas and cost
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // If total gas is less than cost, no solution
        if (totalGas < totalCost)
            return -1;

        int total = 0; // Tracks current net fuel
        int start = 0; // Potential starting station

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];

            if (total < 0) {
                // Cannot reach next station, reset and try next start
                total = 0;
                start = i + 1;
            }
        }

        return start;
    }
}