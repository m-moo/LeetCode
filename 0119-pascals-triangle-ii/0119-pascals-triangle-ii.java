class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        prev.add(1);
        if(rowIndex == 0) return prev;
        prev.add(1);
        if(rowIndex == 1) return prev;

        for(int i=2;i<=rowIndex;i++) {
            curr.add(1);
            for(int j=1;j<prev.size();j++) {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            prev = new ArrayList<>(curr);
            curr.clear();
        }
        return prev;
    }
}