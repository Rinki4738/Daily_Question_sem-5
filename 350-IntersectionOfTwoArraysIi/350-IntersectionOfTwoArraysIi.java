// Last updated: 8/14/2025, 3:46:27 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int max1=nums1[0];
        int max2=nums2[0];
        for(int i=1;i<nums1.length;i++){
            if(nums1[i]>max1){
                max1=nums1[i];
            }}
        for(int i=1;i<nums2.length;i++){
            if(nums2[i]>max2){
                max2=nums2[i];
            }}

        
        int max=Math.max(max1,max2);

        int h[]=new int[max+1];
        for(int i=0;i<nums2.length;i++){
           h[nums2[i]]++;
        }
        int j=0;
        int c=0;
        for(int i=0;i<nums1.length;i++){
            if(h[nums1[i]]!=0){
                c++;
                h[nums1[i]]--;
            }else{
                nums1[i]=0;
            }
        }int res[]=new int[c];
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=0){
                res[j++]=nums1[i];
            }

        }
        
       return res; 
    }
}