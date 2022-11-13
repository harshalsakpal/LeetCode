class Solution {
    String[] vowels = {"a", "e", "i", "o", "u"};

    public String removeVowels(String s) {
        String finalS = "";

        if(s == null || s.length() == 0) {
            return s;
        }

        List<String> vowelList = Arrays.asList(vowels);

        for(int iCount = 1; iCount <= s.length(); iCount++) {

            String character = s.substring(iCount-1, iCount);

            if(vowelList.contains(character)) {
                continue;
            }
            finalS = finalS + character;
        }

        return finalS;
    }
}