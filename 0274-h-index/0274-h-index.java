class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int idx = 0;
        int len = citations.length;
        while(idx < len && citations[len-1-idx] > idx) idx++;
        
        return idx;
    }
}