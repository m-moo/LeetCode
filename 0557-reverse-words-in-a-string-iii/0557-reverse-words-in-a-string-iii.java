class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String rs = "";
        for(int j=0;j<words.length;j++){
            if(j!=0) {
                rs += " ";
            }
            int len = words[j].length();
            for(int i=len-1;i>=0;i--){
                rs += words[j].charAt(i);
            }
        }
        return rs;
    }
}