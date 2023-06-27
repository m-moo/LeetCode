class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> answer = new ArrayList<>();

        backTrack(answer, n,k,1,new ArrayList<>());

        return answer;
    }
    public void backTrack(List<List<Integer>> answer, int n, int k, int start, List<Integer> comb) {
        if(k==0) {
            answer.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            backTrack(answer,n,k-1,i+1,comb);
            comb.remove(comb.size()-1);
        }
    }
}