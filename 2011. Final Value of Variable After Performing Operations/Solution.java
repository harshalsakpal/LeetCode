class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for(String op: operations) {
            if(op.equals("X++") || op.equals("++X")) {
                result++;
            } else if(op.equals("X--") || op.equals("--X")) {
                result--;
            }
        }
        return result;
    }
}