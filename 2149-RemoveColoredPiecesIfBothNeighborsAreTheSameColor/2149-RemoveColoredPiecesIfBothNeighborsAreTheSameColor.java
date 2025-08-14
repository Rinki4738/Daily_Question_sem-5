// Last updated: 8/14/2025, 3:42:27 PM
class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0;
        int b=0;
        for(int i=0;i<colors.length()-2;i++){
            if(colors.charAt(i)=='A' && colors.charAt(i+1)=='A' && colors.charAt(i+2)=='A'){
                a++;
            }
            else if(colors.charAt(i)=='B' && colors.charAt(i+1)=='B' && colors.charAt(i+2)=='B'){
                b++;
            }

        }
        System.out.println(a);
        System.out.println(b);
        if(a>b){
            return true;
        }
        return false;
    }
}