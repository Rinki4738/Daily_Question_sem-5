// Last updated: 8/14/2025, 3:45:59 PM
class Solution {
    public int arrangeCoins(int n) {
     long lo=1;
     long hi=n;
     long ans=0;
     while(lo<=hi){
        long mid=lo+(hi-lo)/2;
        if(mid*(mid+1)/2<=n){
            ans=mid;
            lo=mid+1;
        }else{
            hi=mid-1;
        }
     }return (int)(ans);


     
        
       
        
    }
}