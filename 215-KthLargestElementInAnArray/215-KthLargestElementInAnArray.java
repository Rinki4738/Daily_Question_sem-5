// Last updated: 8/14/2025, 3:47:12 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
        int freq[]=new int[max-min+1];
        for(int ele:nums){
            freq[ele-min]++;
        }
        int rem=k;
        for(int i= freq.length-1;i>=0;i--){
            rem-=freq[i];
            if(rem<=0){
                return min+i;
            }
        }
        return -1;
        
    }
}