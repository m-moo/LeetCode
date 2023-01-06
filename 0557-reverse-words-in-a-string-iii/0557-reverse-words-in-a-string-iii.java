class Solution {
    public String reverseWords(String s) {
        StringBuilder rs = new StringBuilder();
        int lastIndex = -1;
        for(int i=0;i<=s.length();i++){
            if(i==s.length() || s.charAt(i)==' ') {
                for(int j=i-1;j>lastIndex;j--){
                    rs.append(s.charAt(j));
                }
                if(i!=s.length()) {
                    rs.append(' ');
                }
                lastIndex = i;
            }
        }
        return new String(rs);
    }
}