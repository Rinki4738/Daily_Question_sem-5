// Last updated: 8/29/2025, 9:01:17 PM
class Solution {
    public int fib(int n) {
       int prev2=0;
       int prev=1;
       int i=0;
       while(i<n){
        int curr=prev+prev2;
        prev2=prev;
        prev=curr;
        i++;
       }
       return prev2;
        

        
    }
}