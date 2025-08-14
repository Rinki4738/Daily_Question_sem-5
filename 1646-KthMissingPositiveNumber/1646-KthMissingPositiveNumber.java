// Last updated: 8/14/2025, 3:43:15 PM
class Solution {
    public int findKthPositive(int[] arr, int k) {
         for(int i=0;i<arr.length;i++){
            if(arr[i]>k+i){
                return k+i;
            }
        }
        return k+arr.length;
        
    }
}