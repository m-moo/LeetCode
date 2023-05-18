class Solution {
    public String minWindow(String s, String t) {
        String answer = "";

        /* tMap 세팅 */
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(char c:t.toCharArray()) tMap.put(c, tMap.getOrDefault(c,0)+1);
        int tCount = tMap.size();

        int start = 0, end = 0, len = Integer.MAX_VALUE, counter = tCount;
        while(end < s.length()) {
            char cEnd = s.charAt(end++);
            if(tMap.containsKey(cEnd)){
                tMap.put(cEnd, tMap.get(cEnd)-1);
                if(tMap.get(cEnd) == 0) counter--; // 필요 개수 소진시 카운터 감소
            }
            /* t 모두 충족시 두번째 일치 시점으로 시작점 이동 */
            while(counter == 0) {
                /* 더 짧을 경우 결과 갱신 */
                if(end - start < len) {
                    len = end - start;
                    answer = s.substring(start,end);
                }
                char cStart = s.charAt(start++);
                if(tMap.containsKey(cStart)) {
                    tMap.put(cStart,tMap.get(cStart)+1);
                    if(tMap.get(cStart) > 0) counter++;
                }
            }
        }
        return answer;
    }
}