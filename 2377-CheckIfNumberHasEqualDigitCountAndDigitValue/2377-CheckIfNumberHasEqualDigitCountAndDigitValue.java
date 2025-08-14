// Last updated: 8/14/2025, 3:42:08 PM
class Solution {
    public boolean digitCount(String num) {
        int freq[]=new int[10];
        for(int i=0;i<num.length();i++){
            int a=num.charAt(i)-48;
            freq[a]++;
        }
        for(int i=0;i<num.length();i++){
           if(freq[i]!=(num.charAt(i)-48)){
            return false;
           }
        }
        return true;
        

        
    }
}