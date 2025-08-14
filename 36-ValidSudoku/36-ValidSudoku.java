// Last updated: 8/14/2025, 3:49:21 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(issafe(board,i,j)==false){
                    return false;
                }
                
            }
        }
        return true;
        
    }
    public static boolean issafe(char board[][],int row,int col){
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==board[row][col]){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==board[row][col]){
                return false;
            }
        }
        int a=row/3;
        int b=col/3;
        for(int i=3*a;i<3*a+3;i++){
            for(int j=3*b;j<3*b+3;j++){
                if(i!=row && j!=col && board[i][j]==board[row][col]){
                    return false;
                }
            }
        }
        return true;
    }
}