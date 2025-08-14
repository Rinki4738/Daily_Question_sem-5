// Last updated: 8/14/2025, 3:41:32 PM
class Solution {
    public long countCompleteDayPairs(int[] hours) {
         long[] mod= new long [24];
        for ( int i=0 ; i<hours.length ; i++){
            mod [hours[i]%24]++;
        }
        long count=0;
        count += (mod[0] * (mod[0] - 1) )/2;
         count += (mod[12] * (mod[12] - 1) )/2;

        for( int i=1 ; i< 12; i++){
            count += mod[i] * mod[24-i];
        }
        return count;
        
    }
}