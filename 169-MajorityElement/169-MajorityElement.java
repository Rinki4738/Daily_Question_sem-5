// Last updated: 8/14/2025, 3:47:28 PM
class Solution {
    public int majorityElement(int[] nums) {
        return Moorevoting(nums);
    }
    public static int Moorevoting(int [] arr){
        int e= arr[0];
        int v=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==e){
                v++;
            }
            else{
                v--;
                if(v==0){
                    e=arr[i];
                    v=1;
                }
            }
        }return e;
    }
}