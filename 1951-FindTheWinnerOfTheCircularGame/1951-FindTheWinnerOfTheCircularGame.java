// Last updated: 8/14/2025, 3:42:36 PM
class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ll=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ll.add(i);
        }
        int i=0;
       while(ll.size()>1){
        i=(i+k-1)%ll.size();
        ll.remove(i);

       }
      return ll.get(0);
    }
}