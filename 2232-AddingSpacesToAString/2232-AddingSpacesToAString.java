// Last updated: 8/14/2025, 3:42:20 PM
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int k = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (k < spaces.length && i == spaces[k]) {  
                str.append(" ");
                k++;
            }
            str.append(s.charAt(i));
        }
        
        return str.toString();
    }
}