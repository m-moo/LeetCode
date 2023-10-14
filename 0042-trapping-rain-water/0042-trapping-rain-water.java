class Solution {
    public int trap(int[] height) {
        int l = 0, r = height.length-1;
        int lMax = height[l], rMax = height[r];
        int water = 0;
        while(l < r) {
            if(lMax < rMax) {
                l++;
                if(lMax < height[l]) {
                    lMax = height[l];
                }else {
                    water += lMax - height[l];
                }
            }else {
                r--;
                if(rMax < height[r]) {
                    rMax = height[r];
                }else {
                    water += rMax - height[r];
                }
            }
        }
        return water;
    }
}