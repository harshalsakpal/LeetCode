/*
 * https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/description/
 */
class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> cellRanges = new ArrayList<String>();
        char[] strArray = s.toCharArray();
        
        for(char c1 = strArray[0]; c1 <= strArray[3]; c1++) {
            for(char c2=strArray[1]; c2<= strArray[4]; c2++) {

                cellRanges.add("" + c1 + c2);
            }
        }
        
        return cellRanges;
    }
}