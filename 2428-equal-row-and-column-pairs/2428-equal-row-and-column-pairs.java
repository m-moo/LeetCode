class Solution {
    public int equalPairs(int[][] grid) {
        int answer = 0;
        int len = grid.length;
        HashMap<Integer,int[]> rowMap = new HashMap<>();
        HashMap<Integer,int[]> colMap = new HashMap<>();

        for(int i=0;i<len;i++) {
            rowMap.put(i,grid[i]);

            int[] col = new int[len];
            for(int j=0;j< grid.length;j++) {
                col[j] = grid[j][i];
            }
            colMap.put(i,col);
        }

        for(int[] r:rowMap.values()) {
            for(int[] c:colMap.values()) {
                if(Arrays.equals(r,c)) answer++;
            }
        }
        return answer;
    }
}