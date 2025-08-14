// Last updated: 8/14/2025, 3:44:44 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            reverse(image[i]);
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image.length;j++){
                if(image[i][j]==0){
                    image[i][j]=1;
                }
                else if(image[i][j]==1){
                    image[i][j]=0;
                }

            }
        }
        return image;}
    
    public static void reverse(int a[]){
        int i=0;
        int j=a.length-1;
        while(i<j){
            int t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
    }
}