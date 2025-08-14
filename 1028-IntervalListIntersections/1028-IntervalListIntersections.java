// Last updated: 8/14/2025, 3:44:08 PM
class Solution {
    public int[][] intervalIntersection(int[][] a, int[][] b) {
        List<int[]> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
          int start=Math.max(a[i][0],b[j][0]);
          int end=Math.min(a[i][1],b[j][1]);
            

            if (start <= end) {
                int arr[]=new int[2];
                arr[0]=start;
                arr[1]=end;
                result.add(arr);
            }

          
            if (a[i][1] < b[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}