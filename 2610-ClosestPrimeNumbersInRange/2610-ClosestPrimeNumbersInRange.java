// Last updated: 8/14/2025, 3:41:52 PM
class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] ans = new int[right+1];
		ans[0] = ans[1] = 1;
		for (int i = 2; i * i <= ans.length; i++) {
			if (ans[i] == 0) {// i prime hai
				for (int j = 2; i * j < ans.length; j++) {
					ans[i * j] = 1;
				}
			}
		}
      int c=0;
		for (int i = left; i < ans.length; i++) {
			if(ans[i]==0) {
				c++;
			}
		}
       
        int pro[]=new int[2];
         if(c<2){
            pro[0]=-1;
            pro[1]=-1;
            return pro;
        }
        int d=0;
    
        int p1=0;
        int p2=0;
        int res=Integer.MAX_VALUE;
        for(int i=left;i<ans.length ;i++){
            if(ans[i]==0){
                p1=p2;
                p2=i;
                d=p2-p1;

                if(d<res){
                    pro[0]=p1;
                    pro[1]=p2;
                    res=d;

                }}





            

        }
    return pro;

        
    }
   
}