// Last updated: 8/14/2025, 3:41:53 PM
class Solution {
    public int smallestValue(int n) {
        while(true){
            if(primefactor(n)!=n){
                n=primefactor(n);

            }
            else{
                break;
            }
        }
        return n;

        
    }
    public static int primefactor(int n){
        int a=2;
        int s=0;
        while(n>1){
            if(n%a==0){
                n=n/a;
                s+=a;
            }
            else{
                a++;
            }
        }
        return s;
    }
}