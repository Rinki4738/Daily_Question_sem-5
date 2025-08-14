// Last updated: 8/14/2025, 3:43:27 PM
class Solution {
    public int kthFactor(int n, int k) {
        HashSet<Integer> set=new HashSet<>();
        List <Integer> ll=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
            set.add(i);
            set.add(n/i);}
        }
        for(int ele:set){
            ll.add(ele);
        }
        if(ll.size()<k){
            return -1;
        }
        Collections.sort(ll);
      // System.out.println(ll);
        return ll.get(k-1);
        
    }
}