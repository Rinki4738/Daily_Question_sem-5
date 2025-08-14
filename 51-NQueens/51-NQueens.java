// Last updated: 8/14/2025, 3:49:03 PM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean arr[][]=new boolean[n][n];
        List<List<String>> ans=new ArrayList<>();
        func(arr,n,ans,0);
        return ans;
        
    }
    public static void func(boolean arr[][],int tq, List<List<String>> ans,int row){
        if(tq==0){
            List<String> ll=construct(arr);
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=0;i<arr[0].length;i++){
            if(issafe(arr,row,i)){
                arr[row][i]=true;
                func(arr,tq-1,ans,row+1);
                arr[row][i]=false;
            }
        }
    }
    public static List<String> construct(boolean arr[][]){
        List<String>ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String a="";
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]){
                    a+="Q";
                }
                else{
                    a+=".";
                }
            }
            ll.add(a);
        }
        return ll;
    }
     public static boolean issafe(boolean arr[][],int row,int col){
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(arr[i][j]){
                return false;
            }
            i--;
            j--;
        }
        i=row;j=col;
        while(j<arr[0].length && i>=0){
            if(arr[i][j]){
                return false;
            }
            i--;
            j++;
        }
        i=row;
        j=col;
        while(i>=0){
            if(arr[i][j]){
                return false;
            }
            i--;
        }
        return true;
    }
}