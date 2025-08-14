// Last updated: 8/14/2025, 3:45:04 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
         int i=0;
        while(i<bits.length){
            if(bits[i]==0){
                if(i==bits.length-1){
                    return true;
                }
                i++;
               
            }
            else{
                i+=2;
               
            }
        }
       return false;
    }
}