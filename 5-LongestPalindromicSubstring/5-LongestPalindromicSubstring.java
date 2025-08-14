// Last updated: 8/14/2025, 3:49:55 PM
class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                if(ispallindrome(a)){
                    if(a.length()>ans.length()){
                        ans=a;
                    }
                }

            }
        }
      return ans;
        
    }
    public static boolean ispallindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}