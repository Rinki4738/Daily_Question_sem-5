// Last updated: 8/14/2025, 3:46:18 PM
class Solution {
    public List<Integer> lexicalOrder(int n) {
       
		List<Integer> ll=new ArrayList<>();
         print(n, 0,ll);
        return ll;
    }
    public static void print(int n,int curr,List<Integer> ll) {
		if(curr>n) {
			return;
		}
		//System.out.println(curr);
		if(curr!=0) {
			ll.add(curr);
		}
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			print(n, curr*10+i,ll);
			
		}
	}

}