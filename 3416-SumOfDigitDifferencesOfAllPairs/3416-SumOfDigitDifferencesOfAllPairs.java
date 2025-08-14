// Last updated: 8/14/2025, 3:41:33 PM
class Solution {
    public long sumDigitDifferences(int[] nums) {
      long s=0;
        String val=""+nums[0];
        int len=val.length();
        for(int i=0;i<len;i++){
           long count[]=new long[10];
           for(int j=0;j<nums.length;j++){
            int v=nums[j];
            int r=v%10;
            count[r]++;
            nums[j]=nums[j]/10;
           }
           for(int j=0;j<count.length;j++){
            if(count[j]!=0)
            s+=count[j]*(nums.length-count[j]);
           }
        }
        return s/2;
         


       


        
    }
}