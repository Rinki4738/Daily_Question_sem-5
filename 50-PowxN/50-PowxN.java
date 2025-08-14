// Last updated: 8/14/2025, 3:49:04 PM
class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            x=1/x;
        }
        return power(x,n);
        
    }
    public static double power(double x,int n){
        if(n==0){
            return 1.0;
        }

        double half=power(x,n/2);
         if(n%2==0){
            return half*half;
         }
         else{
           return  half*half*x;
         }

    }
}