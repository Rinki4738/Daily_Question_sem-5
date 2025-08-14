// Last updated: 8/14/2025, 3:44:46 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String a=s+s;
        return a.contains(goal);
        
    }
}