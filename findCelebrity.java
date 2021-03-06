/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    /**
     * @param n a party with n people
     * @return the celebrity's label or -1
     */
    public int findCelebrity(int n) {
        // Write your code here
        if (n == 1) return 0;
        if (n < 2) return -1;
        int possible = 0;
        for (int i = 1; i < n; i++){
            if (knows(possible, i)){
                possible = i;
            }
        }
        
        for (int i = 0; i < n; i++){
            if (possible != i && ((knows(possible, i) || !knows(i,possible))))
            return -1;
        }
        
        return possible;
    }
}
