class Solution {
    String[][] pad;

    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if(digits.length() == 0) return answer;
        pad = new String[][]{
            {},{},{"a","b","c"},{"d","e","f"},
            {"g","h","i"},{"j","k","l"},{"m","n","o"},
            {"p","q","r","s"},{"t","u","v"},{"w","x","y","z"}
        };

        backTrack("",0, digits, answer);

        return answer;
    }

    public void backTrack(String comb, int depth, String digits, List<String> answer) {
        if(depth == digits.length()) {
            answer.add(comb);
            return;
        }

        int digit = digits.charAt(depth) - '0';
        for(int i=0;i<pad[digit].length;i++) {
            StringBuilder sb = new StringBuilder(comb);
            sb.append(pad[digit][i]);
            backTrack(sb.toString(), depth+1, digits, answer);
        }
    }
}