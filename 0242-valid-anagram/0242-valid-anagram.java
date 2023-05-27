class Solution {
    public boolean isAnagram(String s, String t) {
        int[] map = new int[26];
        
        for(int i=0;i<s.length();i++) map[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) map[t.charAt(i)-'a']--;
        
        for(int i=0;i<=map.length/2;i++) {
            if(map[i] != 0 || map[map.length-1-i] != 0) return false;
        }
        return true;
    }
}