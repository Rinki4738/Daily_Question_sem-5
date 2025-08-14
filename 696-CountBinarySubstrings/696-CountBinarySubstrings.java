// Last updated: 8/14/2025, 3:45:07 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int count=0;
        int prev=0;
        int curr=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                count+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }

        }
         count+=Math.min(prev,curr);
        return count;
        
    }
}