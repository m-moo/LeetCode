class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<Math.max(len1, len2);i++) {
            if(i < len1) sb.append(word1.charAt(i));
            if(i < len2) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}