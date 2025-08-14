// Last updated: 8/14/2025, 3:45:15 PM
class Solution {
    public int [] findErrorNums(int[] arr) {
       int a[]=new int[arr.length+1];
       int ans[]=new int[2];
       a[0]=1;
       for(int i=0;i<arr.length;i++){
        a[arr[i]]++;
       }
       for(int i=0;i<a.length;i++){
        if(a[i]==2){
            ans[0]=i;
        }if(a[i]==0){
            ans[1]=i;
        }
       }
       return ans;
    }
}