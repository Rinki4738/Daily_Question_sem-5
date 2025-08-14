// Last updated: 8/14/2025, 3:43:46 PM
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int cap=capacity;
        int i=-1;
        int step=0;
        while(i<plants.length-1){
            if(plants[i+1]<=capacity){
                step++;
                capacity-=plants[i+1];
            }
            else{
                step+=(2*i+3);
                capacity=cap-plants[i+1];

            }
            i++;
        }
        return step;
        
    }
}