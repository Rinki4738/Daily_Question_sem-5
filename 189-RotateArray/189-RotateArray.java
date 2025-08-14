// Last updated: 8/14/2025, 3:47:22 PM
class Solution {
    public void rotate(int[]nums,int k){
        Rotate(nums,k);
    }
    public void Rotate(int[] arr, int k) {
        int n=arr.length;
        k=k%n;
        //startting n-k reverse  kro
        Reverse(arr,0,n-k-1);
        //last ke k reverse kro
        Reverse(arr,n-k,n-1);
        //all element reverse kro
        Reverse(arr,0,n-1);
    }
    public static void Reverse(int[] arr,int i,int j){
        while(i<j){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
}