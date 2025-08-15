// Last updated: 8/15/2025, 5:39:48 PM
class Solution {
    public String largestGoodInteger(String s) {
        int ans=0;
        int flag=0;
        for(int i=0;i<s.length()-2;){
            if(s.charAt(i)==s.charAt(i+1) && s.charAt(i)==s.charAt(i+2)){
                int k=s.charAt(i)-'0';
                flag=1;
               ans= Math.max(ans,k);
               i+=3;

            }
            else{
                i++;
            }
        }
        if(flag==0){
            return "";
        }
        return ans+""+ans+""+ans;
        
        
    }
}