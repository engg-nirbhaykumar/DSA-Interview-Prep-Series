class Solution {

    List<String> result;

    public List<String> addOperators(String num, int target) {
        result = new ArrayList<>();
        backtrack(num, target, 0, 0, 0, "");
        return result;
    }

    private void backtrack(String num, int target,
            int index, long value, long prev, String expr) {

        // Base case: reached end of string
        if (index == num.length()) {
            if (value == target) {
                result.add(expr);
            }
            return;
        }

        // Try all possible numbers starting at 'index'
        for (int i = index; i < num.length(); i++) {

            // Skip numbers with leading zero
            if (i > index && num.charAt(index) == '0')
                break;

            String part = num.substring(index, i + 1);
            long current = Long.parseLong(part);

            // First number in expression (no operator before it)
            if (index == 0) {
                backtrack(num, target, i + 1, current, current, part);
            } else {

                // Addition
                backtrack(num, target,
                        i + 1,
                        value + current,
                        current,
                        expr + "+" + part);

                // Subtraction
                backtrack(num, target,
                        i + 1,
                        value - current,
                        -current,
                        expr + "-" + part);

                // Multiplication (handle precedence)
                backtrack(num, target,
                        i + 1,
                        value - prev + prev * current,
                        prev * current,
                        expr + "*" + part);
            }
        }
    }
}
