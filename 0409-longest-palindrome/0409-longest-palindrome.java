class Solution {
    public int longestPalindrome(String s) {
        int answer = 0;
        
        /* 알파벳 개수 체크 */
        int[] alph = new int[128];
        for(int i=0;i<s.length();i++) {
            alph[s.charAt(i)]++;
        }
        
        for(int i=0;i<alph.length;i++) {
            if(alph[i] != 0) {
                answer += alph[i]/2*2; // 2개 이상이면 가능한 짝수 개수 만큼 추가
                
                /* answer 글자 수가 짝수이면 나머지 알파벳 추가*/
                if(answer%2==0 && alph[i]%2!=0) answer++;
            }
        }
        return answer;
    }
}