class Solution {
    public boolean isValid(String s) {
        char[] sArr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<sArr.length;i++) {
            char c = sArr[i];
            if(c == '(' || c == '[' || c == '{') st.add(sArr[i]);
            else {
                if(st.isEmpty()) return false;
                if(c == ')' && st.peek() == '(' ||
                    c == ']' && st.peek() == '[' ||
                    c == '}' && st.peek() == '{') st.pop();
                else return false;
            }
        }
        
        return st.isEmpty();
    }
}