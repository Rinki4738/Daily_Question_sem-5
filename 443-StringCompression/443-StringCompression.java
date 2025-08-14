// Last updated: 8/14/2025, 3:45:56 PM
class Solution {
    public int compress(char[] chars) {
      String s="";
      int j=0;
      int c=0;
      for(int i=0;i<chars.length-1;i++){
        if((""+chars[i]).equals(""+chars[i+1])){
            c++;
        }
        else{
            c++;
            s+=chars[i];
            if(c!=1){
            s+=""+c;}
            c=0;

        }

      }
      c++;
      s+=chars[chars.length-1];
      if(c!=1){
      s+=""+c;}
      for(int i=0;i<s.length();i++){
        chars[i]=s.charAt(i);
      }
      return s.length();
       
    }
}