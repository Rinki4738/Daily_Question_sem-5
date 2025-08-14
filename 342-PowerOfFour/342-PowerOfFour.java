// Last updated: 8/14/2025, 3:46:32 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        int rem=0;
        while(n>1){
            rem=n%4;
            n=n/4;
            if(rem>0){
                return false;
            }
        }
        return true;
        
    }
}