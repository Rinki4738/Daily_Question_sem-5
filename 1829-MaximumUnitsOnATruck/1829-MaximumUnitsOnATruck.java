// Last updated: 8/14/2025, 3:42:51 PM
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)-> b[1]-a[1]);
        // for(int i=0;i<boxTypes.length;i++){
        //     System.out.println(boxTypes[i][0]+" "+boxTypes[i][1]);
        // }
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize==0){
                break;
            }
            if(boxTypes[i][0]<=truckSize){
                ans+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }else{
                ans+=truckSize*boxTypes[i][1];
                truckSize=0;
            }

            // System.out.println(ans);
        }
        return ans;
    }
}