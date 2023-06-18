class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
        Set<String> wordMap = new HashSet<>(wordList);
        if(!wordMap.contains(endWord)) return 0;

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.offer(beginWord);
        visited.add(beginWord);

        int level = 1;

        /* bfs */
        while(!q.isEmpty()) {
            int size = q.size();

            for(int i=0;i<size;i++) {
                String current = q.poll();
                char[] wordChars = current.toCharArray();
                for(int j=0;j<wordChars.length;j++) {
                    char originChar = wordChars[j];
                    for(char c = 'a';c<='z';c++) {
                        if(wordChars[j] == c) continue;
                        wordChars[j] = c;
                        String newWord = String.valueOf(wordChars);

                        if(newWord.equals(endWord)) return level+1;

                        if(wordMap.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                    wordChars[j] = originChar;
                }
            }
            level++;
        }
        return 0;
    }
}