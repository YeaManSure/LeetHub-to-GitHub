class Solution {
    public boolean isPalindrome(int x) {
        
        String ogNumString = Integer.toString(x);
        StringBuilder newNumString = new StringBuilder();
        
        newNumString.append(ogNumString);
        newNumString.reverse();
        
        String finalString = String.valueOf(newNumString); 
        
        if (ogNumString.equals(finalString)) {
            return true;
        } else {
            return false;
        }
    }
}