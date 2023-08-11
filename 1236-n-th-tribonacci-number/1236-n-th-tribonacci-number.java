class Solution {
    public int tribonacci(int n) {
        int[] map = new int[n<3?3:n+1];
        map[0] = 0;
        map[1] = 1;
        map[2] = 1;
        int s = 3;
        while(s <= n) {
            map[s] = map[s-3]+map[s-2]+map[s-1];
            s++;
        }

        return map[n];
    }
}