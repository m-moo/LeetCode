class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int s:satisfaction) pq.offer(s);

        int answer = 0, curr = 0;
        while(!pq.isEmpty() && pq.peek()+curr > 0) {
            curr += pq.poll();
            answer += curr;
        }
        return answer;
    }
}