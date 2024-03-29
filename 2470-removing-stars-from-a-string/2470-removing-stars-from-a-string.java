class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '*' && !stack.isEmpty()) {
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c:stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}