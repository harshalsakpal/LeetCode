/*
 * https://leetcode.com/problems/valid-parentheses/description/
 */
class Solution {
    public boolean isValid(String s) {
        Stack<String> stackParentheses = new Stack<>();
        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ) {
                stackParentheses.push(Character.valueOf(s.charAt(i)).toString());
                continue;
            } else if(stackParentheses.isEmpty()) {
                return false;
            } else if(s.charAt(i) == ')' && !stackParentheses.peek().equals("(")) {
                return false;                
            } else if(s.charAt(i) == '}' && !stackParentheses.peek().equals("{")){
                return false;
            } else if(s.charAt(i) == ']' && !stackParentheses.peek().equals("[") ) {
                return false;
            }
            stackParentheses.pop();
        }
        return stackParentheses.isEmpty();
    }
}