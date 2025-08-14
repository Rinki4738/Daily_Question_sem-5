// Last updated: 8/14/2025, 3:43:50 PM
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int k=0;
        int nums[]=new int[arr.length];
        for(int ele:arr){
            nums[k++]=ele;
        }
       Arrays.sort(arr);
       int c=1;
       int res[]=new int[arr.length];
       HashMap <Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            map.put(arr[i],c++);
        }
       }
       for(int i=0;i<nums.length;i++){
        res[i]=map.get(nums[i]);
       }
       return res;
        
    }
}