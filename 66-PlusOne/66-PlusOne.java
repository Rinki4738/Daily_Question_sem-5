// Last updated: 8/14/2025, 3:48:45 PM
class Solution {
    public int[] plusOne(int[] digits) {
        int c=0;
        int a[];
        for(int i=0;i<digits.length;i++){
            if(digits[i]==9){
                c++;
            }
        }
        if(c==digits.length){
             a=new int[digits.length+1]; 
        }
        else{
         a=new int[digits.length];
        }

        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
           a[i]=(digits[i]+carry)%10;
           carry=(digits[i]+carry)/10;
        }if(a[0]==0)
        a[0]=1;
        return a;
        
    }
}