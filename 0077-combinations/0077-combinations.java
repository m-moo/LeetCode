class Solution {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if(n <= 0 || k <= 0 || k > n) return answer;
        backTrack(n,k,1,new ArrayList<>());
        return answer;
    }
    
    public void backTrack(int n, int k, int start, List<Integer> comb) {
        if(k==0) {
            answer.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i=start;i<=n;i++) {
            comb.add(i);
            backTrack(n,k-1,i+1,comb);
            comb.remove(comb.size()-1);
        }
    }
}