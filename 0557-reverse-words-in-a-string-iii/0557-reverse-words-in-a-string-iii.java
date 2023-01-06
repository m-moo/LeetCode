class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            String[] w = words[i].split("");
            int len = w.length;
            for(int j=0;j<len/2;j++){
                String tmp = w[j];
                w[j] = w[len-1-j];
                w[len-1-j] = tmp;
            }
            words[i] = String.join("",w);
        }
        return String.join(" ",words);
    }
}