class Solution {
    public int maxArea(int[] height) {
        int answer = 0;

        int l = 0, r = height.length-1;
        while(l < r) {
            int lH = height[l], rH = height[r];
            int vol = (r-l)*Math.min(lH,rH);
            answer = Math.max(answer,vol);
            if(lH <= rH) l++;
            if(lH >= rH) r--;
        }
        
        return answer;
    }
}