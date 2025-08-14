// Last updated: 8/14/2025, 3:41:57 PM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i=0;
        int j=0;
        int c=0;
        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                i++;
                c++;
        }j++;
        }
        return c;
    }
}