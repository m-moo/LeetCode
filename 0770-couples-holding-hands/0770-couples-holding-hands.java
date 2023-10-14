class Solution {
    public int minSwapsCouples(int[] row) {
        int cnt = 0;

        for(int i=0;i<row.length-2;i+=2) {
            int partner;
            if(row[i]%2 == 0) {
                partner = row[i]+1;
            }else {
                partner = row[i]-1;
            }

            int j = i+1;
            while(row[j] != partner) j++;
            if(j == i+1) continue;

            int temp = row[i+1];
            row[i+1] = row[j];
            row[j] = temp;
            cnt++;
        }
        return cnt;
    }
}