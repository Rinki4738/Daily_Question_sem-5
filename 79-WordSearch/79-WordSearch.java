// Last updated: 8/14/2025, 3:48:33 PM
class Solution {
    // static boolean flag=false;
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                   boolean flag= func(board,word,i,j,0);
                    if(flag){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    public static boolean func(char board[][],String word,int row,int col,int idx){
        if(idx==word.length()){
            
            return true;
        }
        if(row>=board.length||col>=board[0].length||row<0||col<0||board[row][col]!=word.charAt(idx)){
            return false;
        }
        
        
         board[row][col]='*';
        int r[]={0,1,0,-1};
        int c[]={1,0,-1,0};
        for(int i=0;i<4;i++){
        boolean a=func(board,word,row+r[i],col+c[i],idx+1); 
        if(a){
            return true;
        }
           
        }
         board[row][col]=word.charAt(idx);
         return false;
    }
}