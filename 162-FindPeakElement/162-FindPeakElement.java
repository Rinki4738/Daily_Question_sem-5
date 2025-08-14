// Last updated: 8/14/2025, 3:47:33 PM
class Solution {
    public int findPeakElement(int[] arr) {
        if(arr.length==1){
            return 0;
        }
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(mid>0 && mid<arr.length-1){
                if(arr[mid-1]<arr[mid] && arr[mid+1]<arr[mid]){
                    return mid;
                }
                else if(arr[mid+1]>arr[mid]){
                    lo=mid+1;
                }
                else if(arr[mid-1]>arr[mid]){
                        hi=mid-1;
                }
            }
            if(mid==0){
                if(arr[0]>arr[1]){
                    return 0;
                }
                else{
                    return 1;
                }
            }
            if(mid==arr.length-1){
                if(arr[mid-1]>arr[mid]){
                    return mid-1;
                }
                else{
                    return mid;
                }
            }

            
        }
        return -1;
        
    }
}