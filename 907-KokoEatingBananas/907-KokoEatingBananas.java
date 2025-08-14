// Last updated: 8/14/2025, 3:44:35 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int lo=1;
        int hi=piles[piles.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;

        
    }
    public static boolean isitpossible(int arr[],int mid,int h){
        int total=0;
        for(int i=0;i<arr.length;i++){
            total+=Math.ceil(arr[i]/(double)mid);
        }
        if(total<=h){
            return true;
        }
        return false;
    }

}