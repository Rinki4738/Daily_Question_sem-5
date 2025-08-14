// Last updated: 8/14/2025, 3:49:20 PM
class Solution {
    public void solveSudoku(char[][] board) {
        func(board,0,0);
    
        
    }
    public static boolean func(char board[][],int row,int col){
        if(row==9){
            return true ;
        }

      
        if(board[row][col]!='.'){
             if(col==8){
                return func(board,row+1,0);
                }
            else{
             return func(board,row,col+1);}
        }
        for(int i=1;i<=9;i++){
            if(issafe(board,row,col,i)){
                board[row][col]=(char)(48+i);
                boolean s=false;
                if(col==8){
                    s=func(board,row+1,0);
                }
                else{
                s=func(board,row,col+1);}
                if(s){
                    return true;
                }

                board[row][col]='.';
            }
           
        }
         return false;
    }
    public static boolean issafe(char board[][],int row,int col,int val){
        for(int i=0;i<9;i++){
            if(i!=col && board[row][i]==val+'0'){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i!=row && board[i][col]==val+'0'){
                return false;
            }
        }
        int a=row/3;
        int b=col/3;
        for(int i=3*a;i<3*a+3;i++){
            for(int j=3*b;j<3*b+3;j++){
                if(i!=row && j!=col && board[i][j]==val+'0'){
                    return false;
                }
            }
        }
        return true;

    }
}