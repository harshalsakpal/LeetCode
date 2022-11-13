class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<String> jewelSet = new HashSet<String>();
        int foundStones = 0;

        for(int iCount=0; iCount<jewels.length(); iCount++) {
            jewelSet.add(String.valueOf(jewels.charAt(iCount)));
        }

        for(int iCount=0; iCount<stones.length(); iCount++) {
            if(jewelSet.contains(String.valueOf(stones.charAt(iCount)))) {
                foundStones++;
            }
        }
        return foundStones;
    }
}