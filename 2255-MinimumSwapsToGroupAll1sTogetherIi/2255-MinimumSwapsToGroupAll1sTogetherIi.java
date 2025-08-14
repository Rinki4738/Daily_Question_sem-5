// Last updated: 8/14/2025, 3:42:14 PM
class Solution {
    public int minSwaps(int[] nums) {
         int arr[]=new int[2*nums.length];
      for(int i=0;i<arr.length;i++){
        arr[i]=nums[i%nums.length];
      }
     
    int total=0;
       for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
               total++;
           }
       }
      
       int si=0;
       int ei=0;
       int count=0;
       int ans=arr.length;
       while(ei<arr.length){
           
          if(arr[ei]==1){
              count++;
          }
           if(ei-si+1>total){
               if(arr[si]==1){
                   count--;
               }
               si++;
           }
           if(ei-si+1==total)
           ans=Math.min((ei-si+1)-count,ans);
           ei++;
       }
       return ans;
    }
}