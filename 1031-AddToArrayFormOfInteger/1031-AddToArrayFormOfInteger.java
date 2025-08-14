// Last updated: 8/14/2025, 3:44:07 PM
class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> l=new ArrayList<>();
        int i=nums.length-1;
        int carry=0;
        while(i>=0 && k>0){
            int num1=k%10;
            int sum=nums[i]+num1+carry;
            l.add(sum%10);
            carry=sum/10;
            k=k/10;
            i--;
        }
        while(i>=0){
           int sum=nums[i]+carry;
            l.add(sum%10);
            carry=sum/10;
            i--;
        }
        while(k>0){
            int num1=k%10;
            int sum=carry+num1;
            l.add(sum%10);
            carry=sum/10;
            k=k/10;
        }
        if(carry!=0){
            l.add(carry);
        }
        Collections.reverse(l);
        return l;

        
    }
}