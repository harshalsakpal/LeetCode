class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        int index = prefix.length();

        for (int i = 1; i < strs.length; i++) {
		
            for (int j = 0; j < index; j++) {
                
                if (j >= strs[i].length() || prefix.charAt(j) != strs[i].charAt(j)) {
                    index = j;
			        break;
                }
            }
        }
        return prefix.substring(0, index);
    }
}