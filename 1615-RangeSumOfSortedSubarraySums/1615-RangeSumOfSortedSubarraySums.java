// Last updated: 8/14/2025, 3:43:22 PM
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int a[]=new int[n * (n + 1) / 2];
        int k=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                a[k++]=s;

            }
        }
        Arrays.sort(a);
        
       long sum=0;
        for(int i=left-1;i<right;i++){
            sum+=(long)(a[i]);
        }
        sum=sum % 1000000007;
        return (int)sum;
        
    }
}