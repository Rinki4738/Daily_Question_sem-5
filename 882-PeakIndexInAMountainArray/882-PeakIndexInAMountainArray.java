// Last updated: 8/14/2025, 3:44:38 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid>0 && mid<arr.length-1){
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid+1]>arr[mid]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }}
            else if(mid==0){
                if(arr[0]>arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            else{
                if(arr[mid]>arr[mid-1]){
                    return mid;
                }
                else{
                   return mid-1;
                }
            }
        }
        return -1;
        
    }
}