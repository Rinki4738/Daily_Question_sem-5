// Last updated: 8/14/2025, 3:46:05 PM
class Solution {
    public int countSegments(String s) {
        
        s=s.trim();
        if(s.equals(""))
        return 0;
        String a[]=s.split("\s+");
        return a.length;
        
    }
}