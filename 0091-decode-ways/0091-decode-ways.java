class Solution {
    public int numDecodings(String s) {
        Integer[] map = new Integer[s.length()];

        return s.length()!=0?numDecode(0,s,map):0;
    }
    
    public int numDecode(int idx, String s, Integer[] map) {
        int len = s.length();
        if(idx == len) return 1; // 마지막 글자이므로 1 반환

        char c = s.charAt(idx);
        if(c == '0') return 0; // 0+n의 조합은 불가능 하므로 0을 반환
        if(map[idx] != null) return map[idx]; // 기록이 있다면 기록 반환

        int rs = numDecode(idx+1,s,map); // 다음 글자의 경우의 수 더하기

        if(idx < len-1 && (c == '1' || c == '2' && s.charAt(idx+1) < '7'))
            rs += numDecode(idx+2,s,map); // 두자리 수 일때 다음 글자의 경우의 수 더하기
        return map[idx]=rs; // 최종값 기록하며 반환
    }
}