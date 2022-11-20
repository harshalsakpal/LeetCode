/**
 * https://leetcode.com/problems/decode-the-message/description/
 */
class Solution {
    public String decodeMessage(String key, String message) {
        
        String decryptedMessage = "";
        Map<Character, Character> keyToMessage = new HashMap<>();
        key = key.replaceAll(" ", "");
        
        char startingChar = 'a';
        for(char keyChar: key.toCharArray()) {

            if(keyToMessage.get(Character.valueOf(keyChar)) == null) {

                keyToMessage.put(Character.valueOf(keyChar), startingChar);
                startingChar++;
            }            
        }
        keyToMessage.put(' ', ' ');
        for(char messageChar: message.toCharArray()) {

            decryptedMessage += keyToMessage.get(messageChar);
        }

        return decryptedMessage;
    }
}