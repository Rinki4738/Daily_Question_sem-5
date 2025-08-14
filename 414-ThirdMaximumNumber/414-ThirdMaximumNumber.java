// Last updated: 8/14/2025, 3:46:07 PM
class Solution {
    public int thirdMax(int[] arr) {
       
        long first=Long.MIN_VALUE;
        long sec=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                third=sec;
                sec=first;
                first=arr[i];
            }
            else if(arr[i]>sec && arr[i]!=first){
                third=sec;
                sec=arr[i];
            }
            else if(arr[i]>third && arr[i]!=sec && arr[i]!=first){
                third=arr[i];
            }
        }
        if(third==Long.MIN_VALUE)
        return (int)first;

        return (int)third;
        
    }
}