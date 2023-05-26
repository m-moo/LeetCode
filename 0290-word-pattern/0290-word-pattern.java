class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] pArr = new int[26];
        String[] sArr = s.split(" ");
        HashMap<String,Integer> sMap = new HashMap<>();
        
        if(pattern.length() != sArr.length) return false;

        int idx = 1;
        for(int i=0;i<pattern.length();i++) {
            char c = pattern.charAt(i);
            if(sMap.get(sArr[i]) == null) {
                if(pArr[c - 'a'] != 0) return false;
                pArr[c - 'a'] = idx;
                sMap.put(sArr[i],idx++);
            }
            if(sMap.get(sArr[i]) != pArr[c-'a']) return false;
        }
        return true;
    }
}