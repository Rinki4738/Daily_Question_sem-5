// Last updated: 8/14/2025, 3:43:45 PM
class Solution {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        int lo=1;
        int hi=candies[candies.length-1];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(candies,k,mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
        
    }
    public static boolean isitpossible(int nums[],long k,int mid){
        long noc=0;
        for(int i=0;i<nums.length;i++){
            noc+=nums[i]/mid;
        }

       // System.out.println(noc+" "+mid);
        if(noc>=k){
            return true;
        }
        return false;
    }
}