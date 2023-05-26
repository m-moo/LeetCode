class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] ransomArr = ransomNote.split("");
        StringBuilder sb = new StringBuilder(magazine);
        for(int i=0;i<ransomArr.length;i++) {
            int idx = sb.indexOf(ransomArr[i]);
            if(idx < 0) return false;

            sb.deleteCharAt(idx);
        }
        return true;
    }
}