/*
 * https://leetcode.com/problems/valid-anagram/description/
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        boolean output = false;

        if((s.isEmpty() && t.isEmpty()) || (s.length() != t.length()) ) {
            return output;
        }
        
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();

        for(int i=0; i<s.length(); i++) {
            sList.add(s.charAt(i));
            tList.add(t.charAt(i));
        }

        Collections.sort(sList);
        Collections.sort(tList);

        if(sList.equals(tList)) {
            output = true;
        }

        return output;
    }
}