class Solution {
    boolean[] visited;

    public int findCircleNum(int[][] isConnected) {
        visited = new boolean[isConnected[0].length];
        int answer = 0;
        for(int i=0;i<isConnected.length;i++) {
            answer += getProvince(isConnected, i);
        }
        return answer;
    }
    
    public int getProvince(int[][] c, int idx) {
        if(!visited[idx]) {
            visited[idx] = true;
            for(int i=0;i<c[0].length;i++) {
                if(!visited[i] && i!=idx && c[idx][i] == 1) getProvince(c, i);
            }
            return 1;
        }
        return 0;
    }
}