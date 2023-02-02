class Solution {
    public boolean isPalindrome(String s) {
        String w = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        if(w.length()==1) return true;
        for(int i=0;i<w.length()/2;i++){
           if(w.charAt(i) != w.charAt(w.length()-1-i)) return false;
        }
        return true;
    }
}