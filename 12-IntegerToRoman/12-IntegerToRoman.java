// Last updated: 8/14/2025, 3:49:47 PM
class Solution {
    public String intToRoman(int num) {
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String s[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int times=num/val[i];
            while(times>0){
                ans.append(s[i]);
                times--;
            }
            num=num%val[i];
        }
        return ans.toString();
        
        
        
    }
}