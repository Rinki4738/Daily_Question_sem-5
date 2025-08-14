// Last updated: 8/14/2025, 3:43:08 PM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=1;
        int ans=0;
        int hi=position[position.length-1]-position[0];
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(position,m,mid)){
                ans=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
        
    }
    public static boolean isitpossible(int nums[],int m,int mid){
        int nob=1;
        int position=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-position>=mid){
                nob++;
                position=nums[i];
            }
            if(nob==m){
                return true;
            }
        }
        return false;
    }
}