// Last updated: 8/14/2025, 3:47:59 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
            int val=1;
            ll.add(val);
            for(int j=0;j<i;j++){
                val=val*(i-j)/(j+1);
                ll.add(val);
               
            }
            ans.add(ll);
        }
        return ans;
        
    }
}