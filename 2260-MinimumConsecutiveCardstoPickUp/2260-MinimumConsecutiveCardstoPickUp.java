// Last updated: 8/26/2025, 4:29:33 PM
class Solution {
    public int minimumCardPickup(int[] cards) {
        int si=0;
        int ei=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        while(ei<cards.length){
            if(!map.containsKey(cards[ei])){
                map.put(cards[ei],ei);
            }
            else{
                ans=Math.min(ans,ei-map.get(cards[ei])+1);
                // while(si<ei){
                //     map.remove(cards[si]);
                //     si++;
                // }
                map.put(cards[ei],ei);

            }
            ei++;
           

        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;

        
    }
}