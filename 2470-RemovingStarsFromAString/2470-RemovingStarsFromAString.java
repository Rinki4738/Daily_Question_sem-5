// Last updated: 8/14/2025, 3:42:03 PM
class Solution {
    public String removeStars(String s) {
        char[] arr=s.toCharArray();
        int idx=0;
        for(char ch : arr){
            if(ch=='*'){
                idx--;
            }
            else{
                arr[idx]=ch;
                idx++;
            }
        }
        return new String(arr,0,idx);
        
    }
}