/*
 * https://leetcode.com/problems/sort-the-people/description/
 */
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] output = new String[names.length];
        Map<Integer, String> heightToName = new TreeMap<>(Comparator.reverseOrder());

        for(int i=0; i<names.length; i++) {

            heightToName.put(heights[i], names[i]);
        }
        
        int j=0;
        for(String name: heightToName.values()) {
            output[j] = name;
            j++;
        }

        return output;
    }
}