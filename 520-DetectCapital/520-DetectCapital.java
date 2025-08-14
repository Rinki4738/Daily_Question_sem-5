// Last updated: 8/14/2025, 3:45:44 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int cap=0;
        for(int i=0;i<word.length();i++){
           if(word.charAt(i)<97){
            cap++;
           }
        }
        if(cap==word.length()||cap==0)
        return true;
        else if(cap==1 && word.charAt(0)<97){
            return true;
        }else{
            return false;
        }
        
        
    }
}