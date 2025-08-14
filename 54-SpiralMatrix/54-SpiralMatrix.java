// Last updated: 8/14/2025, 3:48:58 PM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       return Print(matrix);
    }
    public static List<Integer> Print(int[][] arr) {
		// TODO Auto-generated method stub
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		int te = arr.length * arr[0].length;
		int c = 0;
       List<Integer> newList = new ArrayList<>();
 
		while (c < te) {
			for (int i = minc; i <= maxc && c < te; i++) {
				newList.add(arr[minr][i]);
				c++;
			}
			minr++;
			for (int i = minr; i <= maxr && c < te; i++) {
                newList.add(arr[i][maxc]);
				c++;
			}
			maxc--;
			for (int i = maxc; i >= minc && c < te; i--) {
                 newList.add(arr[maxr][i]);
				c++;
			}
			maxr--;
			for (int i = maxr; i >= minr && c < te; i--) {
                newList.add(arr[i][minc]);
				c++;
			}
			minc++;
		}
        return newList;
	}

}
   