// Last updated: 8/14/2025, 3:41:41 PM
class Solution {
    public int[] circularGameLosers(int n, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // List<Integer> ll=new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     ll.add(i);
        // }
        int i=1;
        int idx=0;
        while(true){
            if(map.containsKey(idx+1)){
                map.put((idx+1),2);
                    break;
            }
            map.put((idx+1),1);
            idx++;
             idx=(idx+i*k-1)%n;
            
            i++;

        }
       int ans[]=new int[n];
       int j=0;
       for(int m=2;m<=n;m++){
       if(!map.containsKey(m))
        ans[j++]=m;
       }
       return Arrays.copyOfRange(ans,0,j);
      
    }
}