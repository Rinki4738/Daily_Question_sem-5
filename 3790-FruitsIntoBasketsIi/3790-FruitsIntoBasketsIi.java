// Last updated: 8/14/2025, 3:41:06 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int bas[]=new int[baskets.length+1];
        int c=0;
        for(int i=0;i<fruits.length;i++){ 
            int flag=0;
           for(int j=0;j<baskets.length;j++){
               if(bas[j]==0 && baskets[j]>=fruits[i]){
                   flag=1;
                   bas[j]=1;
                   break;
               }
           }
            if(flag==0)
            c++;
        }
        return c;
        
    }
}