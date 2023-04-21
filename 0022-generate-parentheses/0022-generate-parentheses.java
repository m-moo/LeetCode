class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        backTrack(n,0,0,"",answer);
        return answer;
    }
    
    public void backTrack(int max, int open, int close, String track, List<String> answer) {
        if(max*2 == track.length()) {answer.add(track); return;}

        if(open < max) backTrack(max,open+1,close,track+"(",answer);
        if(close < open) backTrack(max,open,close+1,track+")",answer);
    }
}