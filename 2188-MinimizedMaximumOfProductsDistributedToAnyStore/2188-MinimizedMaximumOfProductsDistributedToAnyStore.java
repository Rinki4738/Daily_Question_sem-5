// Last updated: 8/14/2025, 3:42:24 PM
class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int lo=1;
        int hi=Integer.MAX_VALUE;
        for(int i=0;i<quantities.length;i++){
            hi=Math.max(hi,quantities[i]);
        }
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(isitpossible(n,quantities,mid)){
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
        
    }
    public static boolean isitpossible(int n,int quantities[],int mid){
        int a=0;
        for(int i=0;i<quantities.length;i++){
            a+=Math.ceil(quantities[i]/(mid*1.0));
        }
        return a<=n;

    }
}