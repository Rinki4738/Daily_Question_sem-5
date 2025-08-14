// Last updated: 8/14/2025, 3:44:16 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        while(n-->0){
            int c=a+b;
            a=b;
            b=c;
           
        }
        return a;
        
    }
}