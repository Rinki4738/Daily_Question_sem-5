// Last updated: 8/14/2025, 3:48:55 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        List<int[]> ans=new ArrayList<>();
        int a=intervals[0][0];
        int b=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=b){
                b=Math.max(intervals[i][1],b);
                a=Math.min(intervals[i][0],a);
            }
            else{
                int ll[]=new int[2];
                ll[0]=a;
                ll[1]=b;
                a=intervals[i][0];
                b=intervals[i][1];
                 ans.add(ll);
            }
           
        }
         int ll[]=new int[2];
                ll[0]=a;
                ll[1]=b;
              
                 ans.add(ll);
      
        return ans.toArray(new int[ans.size()][]);
        
    }
}