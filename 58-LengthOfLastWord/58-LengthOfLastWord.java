// Last updated: 8/14/2025, 3:48:52 PM
class Solution {
    public int lengthOfLastWord(String s) {
        String a[]=s.split("\s+");
        return a[a.length-1].length();
        
    }
}