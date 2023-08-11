class Solution {
    boolean[] visited = new boolean[10];
    int limitCount;

    public List<List<Integer>> combinationSum3(int k, int n) {
        HashSet<List<Integer>> answer = new HashSet<>();
        limitCount = k;
        backTrack(new HashSet<>(), 1, n, answer);

        return new ArrayList<>(answer);
    }
    public void backTrack(HashSet<Integer> comb, int currentCount, int left, HashSet<List<Integer>> answer) {
        if(currentCount > limitCount) {
            if(left == 0) answer.add(new ArrayList<>(comb));
            return;
        }

        for(int i=1;i<visited.length;i++) {
            if(visited[i]) continue;

            visited[i] = true;
            HashSet<Integer> newComb = new HashSet<>(comb);
            if(i <= left) {
                newComb.add(i);
                backTrack(newComb, currentCount+1, left-i, answer);
            }
            visited[i] = false;
        }
    }
}