// Last updated: 8/14/2025, 3:44:14 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int freq[]=new int[k];
        int sum=0;
        freq[0]=1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            freq[rem]++;
        }int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=2){
                count+=(freq[i])*(freq[i]-1)/2;
            }
        }
        return  count;
    }
}