// Last updated: 8/14/2025, 3:44:41 PM
class Solution {
    public int longestMountain(int[] arr) {
        int i=1;
        int ans=0;
        while(i<arr.length-1){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i-1;
                int right=i+1;
                while(left>0 && arr[left]>arr[left-1]){
                    left--;
                }
                 while(right<arr.length-1 && arr[right]>arr[right+1]){
                    right++;
                }
                ans=Math.max(ans,right-left+1);
                i=right;
            }else{
                i++;
            }
        }
        return ans;

        
    }
}