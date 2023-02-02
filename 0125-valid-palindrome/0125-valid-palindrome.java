class Solution {
    public boolean isPalindrome(String s) {
        int n = 0, b = s.length()-1;
        while(n<b) {
            while(!Character.isLetterOrDigit(s.charAt(n)) && n < b) ++n;
            while(!Character.isLetterOrDigit(s.charAt(b)) && n < b) --b;
            
            if(Character.toLowerCase(s.charAt(n++)) !=
                Character.toLowerCase(s.charAt(b--))) return false;
        }
        return true;
    }
}