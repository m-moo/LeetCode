class Solution {
    public int hIndex(int[] citations) {
        int count = 0;
        int len = citations.length;;
        int[] map = new int[len+1];

        for(int c:citations) ++map[Math.min(c,len)];

        for(int i=len;i>=0;i--) {
            count += map[i];
            if(count >= i) return i;
        }
        return 0;
    }
}