class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] map = new boolean[s.length()+1];
        map[0] = true;

        for(int i=1;i<=s.length();i++) {
            for(String w:wordDict) {
                /* 단어가 들어갈 만큼의 인덱스이고 단어의 시작지점이 일치해야 함 */
                if(w.length() <= i && map[i-w.length()]) {
                    /* 단어와 같다면 map에 다음 단어의 시작지점을 표시 */
                    if(s.substring(i-w.length(),i).equals(w)){
                        map[i] = true;
                        break;
                    }
                }
            }
        }
        
        return map[s.length()];
    }
}