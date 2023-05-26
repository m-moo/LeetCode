class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();
        for(int i=0;i<s.length();i++) {
            char sc = s.charAt(i), tc = t.charAt(i);
            if(!sList.contains(sc)) sList.add(sc);
            if(!tList.contains(tc)) tList.add(tc);
            if(sList.indexOf(sc) != tList.indexOf(tc)) return false;
        }
        return true;
    }
}