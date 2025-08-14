// Last updated: 8/14/2025, 3:42:33 PM
class Solution {
    public String removeOccurrences(String s, String part) {
       while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }  

        return s;
    }
    }
