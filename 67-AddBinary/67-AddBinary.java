// Last updated: 8/14/2025, 3:48:43 PM
class Solution {
    public String addBinary(String a, String b) {
       int la=a.length();
       int lb=b.length();
       la--;
       lb--;
       int sum=0;
       int carry=0;
       String res="";
       while(la>=0 && lb>=0){
        sum=(Integer.parseInt(""+a.charAt(la))+Integer.parseInt(""+b.charAt(lb))+carry);
        carry=sum/2;
        sum=sum%2;
        res+=""+sum;
        la--;
        lb--;
       }
       while(la>=0){
        sum=Integer.parseInt(""+a.charAt(la))+carry;
        carry=sum/2;
        sum=sum%2;
        res+=""+sum;
        la--;
       }
        while(lb>=0){
        sum=Integer.parseInt(""+b.charAt(lb))+carry;
        carry=sum/2;
        sum=sum%2;
        res+=""+sum;
        lb--;
       }
       if(carry!=0)
       res+=""+carry;
       String r="";
       for(int i=res.length()-1;i>=0;i--){
        r+=res.charAt(i);
       }
       return r;
        
    }
    
}