// Last updated: 8/14/2025, 3:46:29 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[nums1.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                if(k==0){
                    res[k++]=nums1[i];

                }
                if(k>0 && res[k-1]!=nums1[i]){
                    res[k++]=nums1[i];
                }
                i++;
                j++;
            }
        }
        
        return Arrays.copyOfRange(res,0,k);
    }
}