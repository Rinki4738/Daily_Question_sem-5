// Last updated: 8/14/2025, 3:43:43 PM
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> ll=new ArrayList<>();
        int x=king[0];
        int y=king[1];
        for(int i=x-1;i>=0;i--){
            if(queenlies(queens,i,y)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(y);
                ll.add(l);
                break;
            }
        }
        for(int i=x+1;i<8;i++){
            if(queenlies(queens,i,y)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(y);
                ll.add(l);
                break;
            }
        }
        for(int i=y-1;i>=0;i--){
            if(queenlies(queens,x,i)){
                List<Integer> l=new ArrayList<>();
                l.add(x);
                l.add(i);
                ll.add(l);
                break;
            }
        }
        for(int i=y+1;i<8;i++){
            if(queenlies(queens,x,i)){
                List<Integer> l=new ArrayList<>();
                l.add(x);
                l.add(i);
                ll.add(l);
                break;
            }
        } 
        int i=x-1;
        int j=y+1;
        while(i!=-1 && j!=8){
            if(queenlies(queens,i,j)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(j);
                ll.add(l);
                break;
            }
            i--;
            j++;
        }
        i=x+1;
       j=y+1;
        while(i!=8 && j!=8){
            if(queenlies(queens,i,j)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(j);
                ll.add(l);
                break;
               
            }
             i++;
                j++;
        }
          i=x-1;
         j=y-1;
        while(i!=-1 && j!=-1){
            if(queenlies(queens,i,j)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(j);
                ll.add(l);
                break;
                
            }
            i--;
                j--;
        }
         i=x+1;
         j=y-1;
        while(i!=8 && j!=-1){
            if(queenlies(queens,i,j)){
                List<Integer> l=new ArrayList<>();
                l.add(i);
                l.add(j);
                ll.add(l);
                break;
               
            }
             i++;
                j--;
        }
        return ll;
        
    }
    public static boolean queenlies(int[][]queens,int x,int y){
        for(int i=0;i<queens.length;i++){
            if(queens[i][0]==x && queens[i][1]==y){
                return true;
            }
        }
        return false;
    }
}