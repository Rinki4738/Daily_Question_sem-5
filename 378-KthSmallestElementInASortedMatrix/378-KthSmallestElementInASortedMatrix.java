// Last updated: 8/14/2025, 3:46:21 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int arr[]=new int[matrix.length*matrix[0].length];
        int idx=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr[idx++]=matrix[i][j];

            }
        }
        Arrays.sort(arr);
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid==(k-1)){
                return arr[mid];
            }
            else if(mid<(k-1)){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return 0;
        
    }
}