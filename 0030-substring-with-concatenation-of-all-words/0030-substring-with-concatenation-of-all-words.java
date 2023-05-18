class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();
        for(String w:words) {
            wordCount.put(w,wordCount.getOrDefault(w,0)+1);
        }

        int wordLen = words[0].length();
        int wordListLen = words.length;

        for(int i=0;i<=s.length()-wordLen*wordListLen;i++) {
            HashMap<String,Integer> seenWords = new HashMap<>();
            for(int j=0;j<wordListLen;j++) {
                int start = i+j*wordLen;
                String sub = s.substring(start, start+wordLen);
                if(wordCount.containsKey(sub)) {
                    seenWords.put(sub, seenWords.getOrDefault(sub,0)+1);
                    if(seenWords.get(sub) > wordCount.get(sub)) break;
                }else break;

                if(j+1 == wordListLen) answer.add(i);
            }
        }
        return answer;
    }
}