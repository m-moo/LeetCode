class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> answer = new ArrayList<>();

        int wLen = words[0].length();
        int lineLen = wLen* words.length;
        int end =lineLen;
        int start = 0;
        
        while(end <= s.length()) {
            String line = s.substring(start,end);

            List<String> wList = new ArrayList<>(Arrays.asList(words));
            for(int k=0;k<line.length();k+=wLen) {
                String w = line.substring(k,k+wLen);
                if(wList.contains(w)) wList.remove(w);
                else break;
            }
            if(wList.isEmpty()) answer.add(start);
            start++;
            end++;
        }
        return answer;
    }
}