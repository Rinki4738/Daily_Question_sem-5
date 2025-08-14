// Last updated: 8/14/2025, 3:41:07 PM
class Solution {
    public String concatHex36(int n) {
        int square=n*n;
        String ans="";
        while(square>0){
            int rem=square%16;
            if(rem>9){
                int num=rem-10;
                char ch=(char)(65+num);
                ans+=ch;
            }
            else{
                ans+=""+rem;
            }
            square=square/16;
        }
        int cube=n*n*n;
        String ans2="";
        while(cube>0){
            int rem=cube%36;
            if(rem>9){
                int num=rem-10;
                char ch=(char)(65+num);
                ans2+=ch;
            }
            else{
                ans2+=""+rem;
            }
            cube=cube/36;
        }
         String res="";
        for(int i=ans.length()-1;i>=0;i--){
            res+=ans.charAt(i);
        }
        for(int i=ans2.length()-1;i>=0;i--){
            res+=ans2.charAt(i);
        }
       
       
        
        return res;
        
        
        
    }
}