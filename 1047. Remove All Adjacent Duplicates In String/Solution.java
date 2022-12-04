/*
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
 */
class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 1) {
            return s;
        }
        
        StringBuilder output = new StringBuilder();
        Stack<Character> chars = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {

            if(!chars.isEmpty() && chars.peek() == s.charAt(i)) {
                chars.pop();
            } else {
                chars.push(s.charAt(i));
            }

        }        

        while(!chars.isEmpty()) {
            output.append(chars.pop());
        }
        
        return output.reverse().toString();
    }
}