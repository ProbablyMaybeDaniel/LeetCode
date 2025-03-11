class Solution {
    public boolean isPalindrome(int x) {
        String xString = String.valueOf(x);
        int xLength = xString.length();
        for(int i = 0; i < xLength/2; i++){
            if(xString.charAt(i) != xString.charAt(xLength-1 - i)){
                return false;
            }
        }
        return true;
    }
}
