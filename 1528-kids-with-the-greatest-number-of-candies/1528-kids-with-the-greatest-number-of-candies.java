class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for(int c:candies) max = Math.max(max,c);

        for(int i=0;i<candies.length;i++) {
            boolean rs = false;
            if(candies[i]+extraCandies >= max) rs = true;
            answer.add(rs);
        }
        return answer;
    }
}