/*
 * https://leetcode.com/problems/isomorphic-strings/description/
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 1) {
            return true;
        }

        Map<Character, Character> chars = new HashMap<>();

         for(int i = 0 ; i< s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(chars.containsKey(sChar)) {
                if(!chars.get(sChar).equals(tChar)) {
                    return false;
                }
            } else {
                if(!chars.containsValue(tChar)) {
                    chars.put(sChar, tChar);
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}