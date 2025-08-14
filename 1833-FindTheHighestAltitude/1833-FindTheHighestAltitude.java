// Last updated: 8/14/2025, 3:42:50 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int a[]=new int[gain.length+1];
        a[0]=0;
        for(int i=0;i<gain.length;i++){
            a[i+1]=a[i]+gain[i];
        }
        int max=a[0];
        for(int i=1;i<gain.length+1;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
        
    }
}