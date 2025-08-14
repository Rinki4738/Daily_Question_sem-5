// Last updated: 8/14/2025, 3:43:04 PM
class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ll=new ArrayList<>();
        for(int i=0;i<l.length;i++){
           ll.add(arithprog(nums,l[i],r[i]));
        }
        return ll;

       


        
    }
    public static boolean arithprog(int nums[],int i,int j){
        int a[]=new int[j-i+1];
        int idx=0;
        for(int k=i;k<=j;k++){
            a[idx++]=nums[k];
        }
        Arrays.sort(a);
        int d=a[1]-a[0];
        for(int h=1;h<a.length-1;h++){
            if(a[h+1]-a[h]!=d){
                return false;
            }
        }
        return true;

    }
}