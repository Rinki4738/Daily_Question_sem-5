// Last updated: 8/14/2025, 3:43:10 PM
class Solution {
    public int minOperations(int n) {
        int num=2*(n/2)+1;
        int sum=0;
       for(int i=0;i<n;i++){
        int ele=2*i+1;
        sum+=Math.abs(num-ele);

       }
       return sum/2;
        
    }
}