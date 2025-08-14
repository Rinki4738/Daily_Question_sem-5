// Last updated: 8/14/2025, 3:46:26 PM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        if(n==1){
            return 10;
        }
        if(n==2){
            return 91;
        }
        int mul=81;
        int c=8;
        int ans=91;
        for(int i=3;i<=n;i++){
            mul=mul*c;
            c--;
            ans+=mul;
        }
        return ans;
        
    }
}