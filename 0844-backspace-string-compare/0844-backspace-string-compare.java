class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> sst = new Stack<>();
        Stack<Character> tst = new Stack<>();

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c < 'a') {
                if (!sst.isEmpty()) sst.pop();
            }else sst.push(c);
        }
        for(int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            if(c < 'a') {
                if(!tst.isEmpty()) tst.pop();
            }else tst.push(c);
        }
        
        return sst.equals(tst);
    }
}