// Last updated: 8/14/2025, 3:49:58 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int freq[]=new int[255];
        int i=0;
        int j=0;
        int ans=0;
        while(j<s.length()){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
        
    }
}