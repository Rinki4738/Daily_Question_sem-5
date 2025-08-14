// Last updated: 8/14/2025, 3:49:53 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i];
                i++;
            }
            else {
                res[k++]=nums2[j];
                j++;
            }
        }
        // i--;
        // j--;
        while(i<nums1.length){
            res[k++]=nums1[i];
            i++;
        }
        while(j<nums2.length){
            res[k++]=nums2[j];
            j++;
        }
        if(res.length%2!=0){
            return (double)(res[(res.length-1)/2]);
        }
        else{
           return (((double)res[(res.length-1)/2]+ res[(res.length-1)/2+1])/2);
        }
    }
}