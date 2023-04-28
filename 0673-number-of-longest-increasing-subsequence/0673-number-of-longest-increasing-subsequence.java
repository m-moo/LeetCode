class Solution {
    public int findNumberOfLIS(int[] nums) {
        int answer = 0;

        int n = nums.length, maxLen = 0;
        int[] cnt = new int[n]; // nums의 각 숫자로 끝나는 배열의 개수
        int[] len = new int[n]; // nums의 각 숫자로 끝나는 배열의 최대 길이

        for(int e=0;e<nums.length;e++) {
            /* s는 e까지 가지 않으므로 미리 1을 증가 */
            len[e] = cnt[e] = 1;
            for(int s=0;s<e;s++) {
                /* 마지막 꼬리수보다 작으면 배열내의 요소로 인정 */
                if(nums[s] < nums[e]) {
                    /* s가 꼬리인 배열의 최대 길이가 e의 현재 배열길이와 1차이라면
                    * e가 꼬리인 배열에서 경우의 수가 나뉘었다는 뜻이므로
                    * s가 꼬리인 배열이 가지는 경우의 수를 카운트에 더해줌*/
                    if(len[s]+1 == len[e]) cnt[e] += cnt[s];
                    if(len[s]+1 > len[e]){
                        len[e] = len[s]+1;
                        cnt[e] = cnt[s];
                    }
                }
            }
            if(maxLen == len[e]) answer += cnt[e];
            if(maxLen < len[e]) {
                maxLen = len[e];
                answer = cnt[e];
            }
        }
        
        return answer;
    }
}