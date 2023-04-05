class Solution {
    public String longestPalindrome(String s) {
        String answer = "";

        for(int i=0 ; i<s.length() ; i++) {
            /* 한글자가 중심이 되는 경우와 아닌 경우 둘 다 계산*/
            int len = Math.max(calc(s,i,i), calc(s,i,i+1));
            if(answer.length()<len) {
                answer = s.substring(i-(len-1)/2, i+len/2+1);
            }
        }
        return answer;
    }
    
    public int calc(String str, int s, int e) {
        /* 글자 범위를 벗어나면 중단*/
        if(s < 0 || e >= str.length()) return 0;
        while(s > -1 && e < str.length() && str.charAt(s) == str.charAt(e)) {
            s--;
            e++;
        }
        return e-s-1;
    }
}