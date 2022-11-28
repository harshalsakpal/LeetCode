/*
 * https://leetcode.com/problems/roman-to-integer/description/
 */
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = getReferenceMap();

        int currentIndex = 0, output = 0, inputLength = s.length();

        while (currentIndex < inputLength) {
            Character currentChar = s.charAt(currentIndex);
            Character nextChar = null;

            if (currentIndex + 1 < inputLength) {
                nextChar = s.charAt(currentIndex + 1);
            }

            if(nextChar != null && map.get(currentChar) < map.get(nextChar)) {
                output -= map.get(currentChar);
            }
            else {
                output += map.get(currentChar);
            }
            currentIndex++;
        }

        return output;        
    }

    private Map<Character, Integer> getReferenceMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }
}