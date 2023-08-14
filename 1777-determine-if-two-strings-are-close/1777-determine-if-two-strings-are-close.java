class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int[] char1 = new int[26];
        int[] char2 = new int[26];

        for(int i=0;i<word1.length();i++){
            char c1 = word1.charAt(i);
            count1[c1-'a']++;
            char1[c1-'a'] = 1;

            char c2 = word2.charAt(i);
            count2[c2-'a']++;
            char2[c2-'a'] = 1;
        }

        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1,count2) && Arrays.equals(char1,char2);
    }
}