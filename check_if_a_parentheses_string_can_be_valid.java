https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/
class Solution {
    public boolean check_if_a_parentheses_string_can_be_valid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }

        int balance = 0;  // Tracks the balance of open and close parentheses
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) { // More closing brackets than possible opening ones
                return false;
            }
        }

        balance = 0;  // Reset balance for the reverse check
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) { // More opening brackets than possible closing ones
                return false;
            }
        }

        return true;  // Both checks passed
    }
}
