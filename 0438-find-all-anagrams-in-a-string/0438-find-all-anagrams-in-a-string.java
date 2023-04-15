class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        if (s.length() == 0 || p.length() == 0 || s.length() < p.length()){
            return new ArrayList<>();
        }
        
        /* map에서 타겟 알파벳 개수 증가로 초기화 */
        int[] map = new int[26];
        for(int i=0;i<p.length();i++) {
            map[p.charAt(i)-'a']++;
        }

        /* 첫 윈도우 설정 */
        int start = 0, end = 0, diff = p.length();
        char tmp;
        for(;end<p.length();end++) {
            tmp = s.charAt(end);

            map[tmp-'a']--;
            /* 타켓 알파벳이라면 diff 차감 */
            if(map[tmp-'a'] >= 0) diff--;
        }
        /* 윈도우 내의 글자가 타겟과 일치하면 답으로 추가 */
        if(diff == 0) answer.add(start);

        while(end < s.length()) {
            /* 윈도우를 옮기는 작업 */
            /* 윈도우의 시작점을 한칸 앞으로 이동한다*/
            tmp = s.charAt(start);
            if(map[tmp-'a'] >= 0) diff++; // 음수가 아니라면 직전에 타겟과 일치했다는 뜻이다. 윈도우 밖이 되므로 필요 차잇값을 복구시킨다.
            map[tmp-'a']++; // 윈도우 밖이 되므로 다시 증가시켜줌
            start++; // 윈도우 시작점 이동

            tmp = s.charAt(end);
            map[tmp-'a']--;
            if(map[tmp-'a'] >= 0) diff--;

            if(diff == 0)answer.add(start);
            end++; // 윈도우 끝점 이동
        }
        return answer;
    }
}