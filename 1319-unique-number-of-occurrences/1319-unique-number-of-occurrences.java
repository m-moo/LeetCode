class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int[] valMap = new int[1001];
        for(int k:map.keySet()) {
            int val = map.get(k);
            valMap[val]++;
            if(valMap[val] > 1) return false;
        }
        return true;
    }
}