// Last updated: 8/14/2025, 3:45:43 PM
class Solution {
    public int findLUSlength(String a, String b) {
        if(!a.equals(b) && a.length()>=b.length()){
            return a.length();

        }else if(!a.equals(b) && a.length()<b.length())
                return b.length();
        return -1;
    }
}