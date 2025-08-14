// Last updated: 8/14/2025, 3:46:24 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long lo=0;
        long hi=num;
        if(num==1)
        return true;
        while(lo<=hi){
           long mid=lo+(hi-lo)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid>num){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }return false;
    }
}