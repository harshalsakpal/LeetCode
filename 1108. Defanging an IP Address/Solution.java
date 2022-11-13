class Solution {
    public String defangIPaddr(String address) {
        StringBuilder defangIPAddr = new StringBuilder("");

        for(int iCount=0; iCount<address.length(); iCount++) {
            if(address.charAt(iCount) == '.') {
                defangIPAddr.append("[.]");
            } else {
                defangIPAddr.append(address.charAt(iCount));
            }
        }
        return defangIPAddr.toString();
    }
}