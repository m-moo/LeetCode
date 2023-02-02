class Solution {
    public boolean isPalindrome(String s) {
        String w = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        String rev = new StringBuffer(w).reverse().toString();
        return w.equals(rev);
    }
}