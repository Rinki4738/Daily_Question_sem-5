// Last updated: 8/14/2025, 3:42:57 PM
class Solution {
    public double averageWaitingTime(int[][] customers) {
        int sum[]=new int[customers.length];
        sum[0]=customers[0][0]+customers[0][1];
        for(int i=1;i<sum.length;i++){
            if(sum[i-1]<customers[i][0]){
                sum[i]=customers[i][0]+customers[i][1];
            }
            else{
            sum[i]=customers[i][1]+sum[i-1];}

        }
        double ans=0;
        ans+=customers[0][1];
        for(int i=1;i<sum.length;i++){
           if(sum[i-1]-customers[i][0]>=0){
            ans+=(sum[i-1]-customers[i][0])+customers[i][1];
           }
           else{
            ans+=customers[i][1];
           }

        }
        System.out.println(ans);
        return ans/customers.length;

        
    }
}