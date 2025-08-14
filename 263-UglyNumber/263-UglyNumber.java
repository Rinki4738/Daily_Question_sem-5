// Last updated: 8/14/2025, 3:46:46 PM
class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        int i=2;
       while(n!=1){
        if(i>5){
            return false;
        }
        if(n%i==0){
            n=n/i;
        }
        else{
            i++;
        }

       }
       return true;
        
    }
}