class Solution {
    public int calculate(String s) {

        Stack<Integer> st = new Stack<>();

        int result = 0;   // current result
        int sign = 1;     // +1 for '+', -1 for '-'
        int num = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Build multi-digit number
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // '+' encountered
            else if (ch == '+') {
                result += sign * num;
                num = 0;
                sign = 1;
            }

            // '-' encountered
            else if (ch == '-') {
                result += sign * num;
                num = 0;
                sign = -1;
            }

            // '(' encountered
            else if (ch == '(') {

                // Save current result
                st.push(result);

                // Save current sign
                st.push(sign);

                // Start fresh for expression inside ()
                result = 0;
                sign = 1;
            }

            // ')' encountered
            else if (ch == ')') {

                // Finish current expression
                result += sign * num;
                num = 0;

                // Multiply by sign before '('
                result *= st.pop();

                // Add result before '('
                result += st.pop();
            }

            // Ignore spaces
        }

        // Add last number
        result += sign * num;

        return result;
    }
}