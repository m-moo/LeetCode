class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();

        HashMap<String,ArrayList<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            // sort given word
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            // get list of sorted word from map
            String sorted = new String(arr);
            ArrayList<String> lst = hm.getOrDefault(sorted,new ArrayList<>());
            
            // add the given word to list, update map
            lst.add(strs[i]);
            hm.put(sorted, lst);

        }
        
        hm.forEach((k,v) -> {
            answer.add(v);
        });
        return answer;
    }
}