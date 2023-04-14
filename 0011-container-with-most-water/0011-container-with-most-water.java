class Solution {
    public int maxArea(int[] height) {
        int answer = 0;

        int l = 0, r = height.length-1;
        while(l < r) {
            int lH = height[l], rH = height[r];
            int vol;
            if(lH <= rH) {
                vol = (r-l)*lH;
                l++;
            }else {
                vol = (r-l)*rH;
                r--;
            }
            answer = Math.max(answer,vol);
        }
        
        return answer;
    }
}