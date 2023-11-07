class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] cnt = new int[score.length];
        for(char c:letters) {
            cnt[c - 'a']++;
        }
        return backTrack(words,cnt,score,0);
    }

    public int backTrack(String[] words, int[] cnt, int[] score, int idx) {
        int max = 0;
        for(int i=idx;i<words.length;i++) {
            int sum = 0;
            boolean isValid = true;
            for(char c:words[i].toCharArray()) {
                int loc = c - 'a';
                cnt[loc]--;
                sum += score[loc];
                if(cnt[loc] < 0) isValid = false;
            }
            if(isValid) {
                sum += backTrack(words, cnt, score, i+1);
                max = Math.max(sum, max);
            }
            for(char c:words[i].toCharArray()) cnt[c - 'a']++;
        }
        return max;
    }
}