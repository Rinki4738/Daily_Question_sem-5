// Last updated: 8/14/2025, 3:45:28 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int a[]=new int[n];
       
        int v=0;
        int z=0;
        for(int i=0;i<n;i++){
             int f=1;
             if(candyType[i]==0){
                z++;
             }
            for(int j=0;j<=i;j++){
                if(candyType[i]==a[j]){
                    f=0;
                break;}
            }
            if(f==1){
                a[v++]=candyType[i];
            }
        }if(z!=0){
            v=v+1;
        }
        int k=Math.min(v,(n/2));
        return k;
        
    }
}