// Last updated: 8/14/2025, 3:41:49 PM
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<banned.length;i++){
            map.put(banned[i],1);
        }
        int c=0;int s=0;
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
               if(s+i<=maxSum){
                s+=i;
                c++;
               }
            }
           
        }
        return c;
    }
}