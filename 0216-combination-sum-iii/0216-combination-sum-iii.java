class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backTrack(k,n,1);
        return answer;
    }
    public void backTrack(int k, int n, int start) {
        if (k == 0) {
            if (n == 0) {
                answer.add(new ArrayList<>(list));
                return;
            }
        }

        for (int i = start; i <= 9; i++) {
            if (i > n) {
                return;
            }
            list.add(i);
            backTrack(k-1,n-i,i+1);
            list.remove(list.size()-1);
        }
    }
}