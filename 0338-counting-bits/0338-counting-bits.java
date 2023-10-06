class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[++n];
        for(int i=1;i<n;i++) {
            int cnt = 0;
            if(i == 1) cnt = 1;
            else {
                int num = i;
                while (num != 0) {
                    num &= (num - 1);
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}