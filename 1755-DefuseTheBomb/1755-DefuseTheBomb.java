// Last updated: 8/14/2025, 3:43:02 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int sum[]=new int[code.length];
        if(k>0){
            k=k%n;
            for(int i=0;i<code.length;i++){
                for(int j=i+1;j<=i+k;j++){
                    sum[i]+=code[j%n];
                }
            }
        }
        if(k<0){
            for(int i=code.length-1;i>=0;i--){
                k=k%n;
                for(int j=i-1;j>=i+k;j--){
                    if(j<0){
                         sum[i]+=code[j+n];
                    }
                    else{
                        sum[i]+=code[j];
                    }
                   
                }

            }
        }
        if(k==0){
            for(int i=0;i<n;i++){
                sum[i]=0;
            }
        }
        return sum;
        
    }
}