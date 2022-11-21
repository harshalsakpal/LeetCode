/*
 * https://leetcode.com/problems/to-lower-case/description/
 */
class Solution {
    public String toLowerCase(String s) {
        
        StringBuilder output = new StringBuilder();

        for(char ch: s.toCharArray()) {

            if(Character.isUpperCase(ch)) {                
                output.append((char)(ch + 32));
                continue;
            }
            output.append(ch);
        }

        return output.toString();
    }
}