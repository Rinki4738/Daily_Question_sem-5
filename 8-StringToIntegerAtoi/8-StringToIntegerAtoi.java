// Last updated: 8/14/2025, 3:49:50 PM
class Solution {
    public int myAtoi(String s) {
       
        s=s.trim();
         if(s.length()==0){
            return 0;
        }
        int i=0;
        int mul=1;

        if(s.charAt(0)=='-'){
            mul=-1;
            i=1;
        }
        if(s.charAt(0)=='+'){
            i=1;
        }
        long ans=0;
        for(;i<s.length();i++){
            if((s.charAt(i)-'0')>=0 && (s.charAt(i)-'0')<=9){
                if((ans*mul)>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if((ans*mul)<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                ans=ans*10+(s.charAt(i)-'0');
            }
            else{
                break;
            }
        }
        if((ans*mul)>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if((ans*mul)<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
        return (int)(ans*mul);
        

        
    }
}