/**
 * https://leetcode.com/problems/count-items-matching-a-rule/description/
 */
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int output = 0;
        Map<String, Integer> indexToRuleKey = new HashMap<>();
        indexToRuleKey.put("type", 0);
        indexToRuleKey.put("color", 1);
        indexToRuleKey.put("name", 2);

        for(List<String> itemList: items) {

            if(itemList.get(indexToRuleKey.get(ruleKey)).equals(ruleValue)) {
                output++;
            }
        }

        return output;
    }
}