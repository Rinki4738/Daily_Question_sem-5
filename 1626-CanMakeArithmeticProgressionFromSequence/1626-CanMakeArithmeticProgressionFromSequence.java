// Last updated: 8/14/2025, 3:43:19 PM
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int d=arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=d){
                return false;
            }
        }
        return true;
        
    }
}