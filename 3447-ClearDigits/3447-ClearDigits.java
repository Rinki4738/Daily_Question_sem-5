// Last updated: 8/14/2025, 3:41:30 PM
class Solution {
    public String clearDigits(String s) {
         char[] arr=s.toCharArray();
        int idx=0;
        for(char ch : arr){
            if(ch>=48 && ch<=57){
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