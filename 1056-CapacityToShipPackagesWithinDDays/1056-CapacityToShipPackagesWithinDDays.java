// Last updated: 8/14/2025, 3:44:02 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int lo=0;
        int hi=0;
        for(int i=0;i<weights.length;i++){
            hi+=weights[i];
        }
        
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(weights,mid,days)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;

        
    }
    public static boolean isitpossible(int arr[],int mid,int days){
        int d=1;
        int i=0;
        int w=0;
        while(i<arr.length){
            if(w+arr[i]<=mid){
                w+=arr[i];
                i++;
            }
            else{
            d++;
            w=0;}
            if(d>days){
                return false;
            }

        }
        return true;
        
        
    }
}