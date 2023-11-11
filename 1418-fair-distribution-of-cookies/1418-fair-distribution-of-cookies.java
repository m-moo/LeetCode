class Solution {
    int min = Integer.MAX_VALUE;
    int[] cookies;
    
    public int distributeCookies(int[] cookies, int k) {
        this.cookies = cookies;
        backTrack(0,new int[k],0);
        return min;
    }

    public void backTrack(int idx, int[] children, int tot) {
        if(idx == cookies.length) {
            min = Math.min(min, tot);
            return;
        }

        for(int i=0;i<children.length;i++) {
            children[i] += cookies[idx];
            int sum = Math.max(tot, children[i]);
            backTrack(idx+1,children,sum);
            children[i] -= cookies[idx];
        }
    }
}