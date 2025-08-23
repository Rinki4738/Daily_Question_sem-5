// Last updated: 8/23/2025, 2:55:04 PM
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b) -> b.compareTo(a));
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y){
                pq.add(x-y);
            }
        }
        if(pq.size()==1){
            return pq.poll();
        }
        return 0;
        
    }
}