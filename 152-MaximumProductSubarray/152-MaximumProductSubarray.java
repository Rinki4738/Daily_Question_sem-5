// Last updated: 8/14/2025, 3:47:38 PM
class Solution {
    public int maxProduct(int[] arr) {
        int max=Integer.MIN_VALUE;
        int left=1;
        int right=1;
        for(int i=0;i<arr.length;i++){
            left=left*arr[i];
            right=right*arr[arr.length-1-i];
            int m=Math.max(left,right);
            max=Math.max(max,m);
            if(left==0){
                left=1;
            }
            if(right==0){
                right=1;
            }
        }
        return max;
      
    }
}