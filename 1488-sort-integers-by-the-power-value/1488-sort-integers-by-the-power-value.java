class Solution {
    public int getKth(int lo, int hi, int k) {
        int[] power = new int[hi-lo+1];
        List<Integer> nums = new ArrayList<>();
        for(int i=lo;i<=hi;i++) {
            int num = i;
            nums.add(i);
            int cnt = 0;
            while(num != 1) {
                cnt++;
                if(num%2 == 0) num/=2;
                else num = 3*num+1;
            }
            power[i-lo] = cnt;
        }
        nums.sort((x,y)-> power[x-lo]-power[y-lo]);

        return nums.get(k-1);
    }
}