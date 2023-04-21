class Solution {
    char[][] alph = {{},{},
        {'a','b','c'},{'d','e','f'},{'g','h','i'},
        {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
        {'t','u','v'},{'w','x','y','z'}
    };
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();

        if(digits.length() == 0) return answer;

        char[] arr = digits.toCharArray();
        backTrack(arr, 0, new StringBuilder(), answer);
        
        return answer;
    }
    
    public void backTrack(char[] digits, int idx, StringBuilder pushed, List<String> answer) {
        if(idx >= digits.length) {answer.add(pushed.toString()); return;}

        int button = digits[idx]-'0';
        for(int i=0;i<alph[button].length;i++) {
            pushed.append(alph[button][i]);
            backTrack(digits, idx+1, pushed, answer);
            pushed.delete(pushed.length()-1,pushed.length());
        }
    }
}