// Last updated: 8/14/2025, 3:43:23 PM
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int ele:arr){
        map.put(ele,map.getOrDefault(ele,0)+1);
       }
      List<Integer> ll=new ArrayList<>(map.values());
      Collections.sort(ll);
      int unique=ll.size();
      for(int i=0;i<ll.size();i++){
        if(ll.get(i)<=k){
            k=k-ll.get(i);
            unique--;
        }else{
            break;
        }
      }
      return unique;
    }
}