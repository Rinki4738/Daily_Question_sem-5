// Last updated: 8/14/2025, 3:49:44 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
      int len=Integer.MAX_VALUE;
int idx=0;
       for(int i=0;i<strs.length;i++){
        if(strs[i].length()<len){
            len=strs[i].length();
            idx=i;
        }
       }
       String a=strs[idx];
      
        String ans="";
        for(int i=0;i<a.length();i++){
            int flag=1;
            for(int j=0;j<strs.length;j++){
                if(a.charAt(i)!=strs[j].charAt(i)){
                       flag=0;
                       break;
                }
            }
            if(flag==1){
                ans+=a.charAt(i);
            }
            else{
                break;
            }
        }
        return ans;
       
        
    }
}