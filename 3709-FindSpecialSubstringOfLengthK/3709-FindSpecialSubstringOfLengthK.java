// Last updated: 8/14/2025, 3:41:16 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
      int i=0;
        int c=0;
        while(i<s.length()-1){
            if(s.charAt(i)==s.charAt(i+1)){
                c++;
            }
            else{
                c++;
               if(c==k){
                   return true;
               }
                c=0;
            }
            i++;
        }
         c++;
        if(c==k)
            return true;
        return false;
       
        
        
    }
}