class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> answer = new ArrayList<>();

        if(firstList.length == 0 || secondList.length == 0) return new int[][]{};

        int fp = 0, sp = 0;
        while(fp < firstList.length && sp < secondList.length) {
            int fStart = firstList[fp][0], sStart = secondList[sp][0];
            int fEnd = firstList[fp][1], sEnd = secondList[sp][1];

            /* 교차점 구하기 */
            int startMax = Math.max(fStart, sStart);
            int endMin = Math.min(fEnd,sEnd);
            if(startMax <= endMin) {
                answer.add(new int[]{startMax,endMin});
            }

            /* end값이 적은 포인터 전진 */
            if(fEnd == endMin) fp++;
            else sp++;
        }
        
        return answer.toArray(new int[answer.size()][2]);
    }
}