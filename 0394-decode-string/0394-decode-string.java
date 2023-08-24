class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> sbStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int num = 0;
        for(char c:s.toCharArray()) {
            if(c >= '0' && c <= '9') {
                num = num*10 + c - '0'; // cuz integers in s are in the range 1-300
            }else if(c == '[') {
                sbStack.push(sb);
                sb = new StringBuilder();
                numStack.push(num);
                num = 0;
            }else if(c == ']') {
                StringBuilder tmp = sb;
                sb = sbStack.pop();
                int cnt = numStack.pop();
                while(cnt-- > 0) sb.append(tmp);
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}