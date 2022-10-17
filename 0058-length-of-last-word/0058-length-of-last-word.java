class Solution {
    public int lengthOfLastWord(String s) {
        
        int counter = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && counter == 0) {
                continue;
            }
            
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                counter++;
            }
            
            if (s.charAt(i) == ' ') {
                break;
            }
        }
        return counter;
    }
}