/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
 */
class Solution {
    public int balancedStringSplit(String s) {
        
        int output = 0;
        int rcount = 0;
        int lcount = 0;
        for(int i=0; i<s.length(); i++) {
            
            if(s.charAt(i) == 'R') {
                rcount++;
            }

            if(s.charAt(i) == 'L') {
                lcount++;
            }

            if(rcount > 0 && lcount > 0 && rcount == lcount) {
                output++;
                rcount = 0;
                lcount = 0;
            }
        }

        return output;
    }
}