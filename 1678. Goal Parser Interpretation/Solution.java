class Solution {
    public String interpret(String command) {
        StringBuilder finalcommand = new StringBuilder("");

        for(int iCount=0; iCount<command.length(); iCount++){
            String aChar = String.valueOf(command.charAt(iCount));

            if(aChar.equals("G")){
                finalcommand.append("G");
            }else if(aChar.equals("(") && String.valueOf(command.charAt(iCount+1)).equals(")")) {
                finalcommand.append("o");
                iCount++;
            }else if(aChar.equals("(") && String.valueOf(command.charAt(iCount+1)).equals("a")) {
                finalcommand.append("al");
                iCount = iCount + 3;
            }
        }
        return finalcommand.toString();
    }
}