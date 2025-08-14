// Last updated: 8/14/2025, 3:43:05 PM
class Solution {
    public int maxDepth(String s) {
        int c=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                c--;
            }
            else if(s.charAt(i)=='('){
                c++;
            }
            ans=Math.max(ans,c);
        }
        return ans;
        
    }
}