// Last updated: 8/14/2025, 3:42:32 PM
class Solution {
    public String largestOddNumber(String s) {
        int i=s.length()-1;
        while(i>=0){
            if((s.charAt(i)-'0')%2==0){
                i--;
            }else{
                break;
            }
        }
        return s.substring(0,i+1);
        
    }
}