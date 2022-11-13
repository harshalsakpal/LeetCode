class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(String sentence: sentences) {
            String[] sentenceArr = sentence.split(" ");
            maxWords = Math.max(maxWords, sentenceArr.length);
        }

        return maxWords;
    }
}