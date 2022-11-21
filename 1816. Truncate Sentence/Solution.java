/**
 * https://leetcode.com/problems/truncate-sentence/description/
 */
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder output = new StringBuilder();
        String[] splitInput = s.split(" ");

        for(int i=0; i<k;i++) {

            output.append(splitInput[i]);
            if(i<k-1) {
                output.append(" ");
            }
        }

        return output.toString();
    }
}