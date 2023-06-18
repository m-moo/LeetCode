class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> bankMap = new HashSet<>(Arrays.asList(bank));
        /* init bank map */
        if(!bankMap.contains(endGene)) return -1;

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        q.offer(startGene);
        visited.add(startGene);

        int level = 0;

        /* bfs */
        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- > 0) {
                String current = q.poll();
                if(current.equals(endGene)) return level;

                char[] currChars = current.toCharArray();
                for(int i=0;i<currChars.length;i++) {
                    char old = currChars[i];
                    for (char c : charSet) {
                        currChars[i] = c;
                        String updateG = new String(currChars);
                        if(!visited.contains(updateG) && bankMap.contains(updateG)) {
                            visited.add(updateG);
                            q.offer(updateG);
                        }
                    }
                    currChars[i] = old;
                }
            }
            level++;
        }
        return -1;
    }
}