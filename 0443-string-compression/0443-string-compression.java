class Solution {
    public int compress(char[] chars) {
        int len = chars.length;
        if(len == 1) return 1;

        int i=0, j=0;
        while(i<len) {
            int cnt = 1;
            char curr = chars[i];
            while(i+1<len && chars[i] == chars[i+1]) {
                cnt++;
                i++;
            }

            chars[j++] = curr;
            if(cnt > 1) {
                String num = cnt+"";
                for(int w=0;w<num.length();w++) {
                    chars[j++] = num.charAt(w);
                }
            }
            i++;
        }
        return j;
    }
}