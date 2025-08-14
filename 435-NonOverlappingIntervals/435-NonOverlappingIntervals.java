// Last updated: 8/14/2025, 3:46:04 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        
        int p0=intervals[0][0];
        int p1=intervals[0][1];
        int remove=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<p1){
                remove++;
                p0=Math.min(intervals[i][0],p0);
                p1=Math.min(intervals[i][1],p1);
            }
            else if(intervals[i][1]==p1 && intervals[i][0]==p0){
                remove++;
                 p0=(intervals[i][0]);
                p1=(intervals[i][1]);
            }
          else{
              p0=(intervals[i][0]);
                p1=(intervals[i][1]);
          }

        }
        return remove;

        
    }
}