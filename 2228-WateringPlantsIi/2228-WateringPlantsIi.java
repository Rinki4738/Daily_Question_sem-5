// Last updated: 8/14/2025, 3:42:21 PM
class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int capA=capacityA;
        int capB=capacityB;
        int i=0;
        int j=plants.length-1;
        int ans=0;
        while(i<j){
            if(plants[i]<=capacityA){
                capacityA-=plants[i];
            }
            else{
                ans++;
                capacityA=capA;
                 capacityA-=plants[i];
            }
            if(plants[j]<=capacityB){
                capacityB-=plants[j];
            }
            else{
                ans++;
                capacityB=capB;
                 capacityB-=plants[j];
            }
            i++;
            j--;
           
        }
        if(i==j && plants[i]>Math.max(capacityA,capacityB)){
            ans++;
        }
        return ans;
        
    }
}