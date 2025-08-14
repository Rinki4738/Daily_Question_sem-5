// Last updated: 8/14/2025, 3:48:53 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result=new int[intervals.length+1][2];
        for(int i=0;i<intervals.length;i++){
            result[i][0]=intervals[i][0];
            result[i][1]=intervals[i][1];
        }
        result[result.length-1][0]=newInterval[0];
        result[result.length-1][1]=newInterval[1];
        result=merge(result);
        return result;
    }
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        int n=intervals.length;
        List<int[]> res=new ArrayList<>();
        int v1=intervals[0][0];
        int v2=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<=v2){
                v2=Math.max(intervals[i][1],v2);
                v1=Math.min(intervals[i][0],v1);
            }
            else{
              int arr[]=new int[2];
                arr[0]=v1;
                arr[1]=v2;
                res.add(arr);
                v1=intervals[i][0];
                v2=intervals[i][1];
            }
        }
         int arr[]=new int[2];
                arr[0]=v1;
                arr[1]=v2;
                res.add(arr);
              
       
        return res.toArray(new int[res.size()][]);

        
        
    }
}