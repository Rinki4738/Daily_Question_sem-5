// Last updated: 8/14/2025, 3:44:00 PM
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
         int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        int num=prefix[arr.length-1];
     
       
        if(num%3!=0){
            return false;
        }
        int a=num/3;
        int b=2*a;
        boolean foundfirst=false;
        for(int i=0;i<prefix.length-1;i++){
            if(!foundfirst && prefix[i]==a){
                foundfirst=true;
                a=i;
            }
            else if(foundfirst && prefix[i]==b){
                return true;
            }
        }
       
 
        return false;

    }
}