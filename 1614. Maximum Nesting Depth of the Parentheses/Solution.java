/*
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
 */
class Solution {
    public int maxDepth(String s) {
        int count=0, output = 0;        
        if(s.contains("(") && s.contains(")")) {

            for(char strChar : s.toCharArray()) {

                if(strChar == '(') {
                    count++;

                    if(count > output) {
                        output = count;
                    }
                } else if(strChar == ')') {

                    count--;
                }
            }
        }
        return output;
    }
}