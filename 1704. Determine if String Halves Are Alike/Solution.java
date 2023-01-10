/*
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
 */
class Solution {
    
    List<String> vowels = Arrays.asList(new String[]{"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"});
    
    public boolean halvesAreAlike(String s) {
        
        int middleIndex = (s.length() / 2);

        String a = s.substring(0, middleIndex);
        String b = s.substring(middleIndex, s.length());

        int aVowelCount = 0, bVowelCount = 0;

        for(int i=0; i<middleIndex; i++) {
            if(vowels.contains(String.valueOf(a.charAt(i)))) {
                aVowelCount++;
            }
            if(vowels.contains(String.valueOf(b.charAt(i)))) {
                bVowelCount++;
            }
        }

        return aVowelCount == bVowelCount;
    }
}