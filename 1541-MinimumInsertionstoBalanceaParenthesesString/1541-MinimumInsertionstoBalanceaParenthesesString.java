// Last updated: 8/28/2025, 9:37:08 PM
class Solution {
    public int minInsertions(String s) {
        int open = 0;       // number of unmatched '('
        int insertions = 0; // total insertions
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '(') {
                open++;
                i++;
            } else {
                // case: "))"
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    if (open > 0) {
                        open--;
                    } else {
                        insertions++; // need one '('
                    }
                    i += 2;
                } else {
                    // case: single ')'
                    if (open > 0) {
                        open--; 
                        insertions++; // need 1 more ')'
                    } else {
                        insertions += 2; // need '(' + ')'
                    }
                    i++;
                }
            }
        }

        return insertions + open * 2;
    }
}
