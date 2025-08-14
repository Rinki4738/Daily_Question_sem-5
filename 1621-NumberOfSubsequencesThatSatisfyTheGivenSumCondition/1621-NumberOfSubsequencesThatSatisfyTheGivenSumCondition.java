// Last updated: 8/14/2025, 3:43:20 PM
class Solution {
    public int numSubseq(int[] nums, int target) {
        long MOD=1_000_000_007;
        Arrays.sort(nums);
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
            int num=target-nums[i];
            int a=search(nums,num,i);
            if(a<0){
                continue;
            }
            long ans=power(2,a-i,MOD);;
            count%=MOD;
            count+=ans;
            }

        }
        count%=MOD;
        return (int)(count);
        
    }
    public static int search(int nums[],int num,int idx){
        int lo=idx;
        int hi=nums.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]<=num){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
     public static long power(int base, long p, long MOD) {
        if (p == 0) {
            return 1;
        }
        long half = power(base, p / 2, MOD);
        long result = (half * half) % MOD;
        if (p % 2 == 1) {
            result = (result * base) % MOD;
        }
        return result;
    }
    
}