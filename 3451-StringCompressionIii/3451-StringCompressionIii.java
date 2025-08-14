// Last updated: 8/14/2025, 3:41:29 PM
class Solution {
    public String compressedString(String word) {
        int c=0;
        String s="";
        for(int i=0;i<word.length()-1;i++){
            if(word.charAt(i)==word.charAt(i+1) && c<8){
                c++;
            }
            else{
                c++;
                s+=""+c;
                s+=word.charAt(i);
                c=0;

            }

        }
        c++;
         s+=""+c;
         s+=word.charAt(word.length()-1);
        
         return s;

        
    }
}