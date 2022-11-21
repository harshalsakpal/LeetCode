/*
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        if(s.length() == 1) {
            return 1;
        }
        Set<Character> charSet = new HashSet<>();
        int i=0, j=0, max=0;
        
        while(j < s.length()) {
            if(!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                max = Math.max(max, charSet.size());
            } else {
                charSet.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}