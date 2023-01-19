class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();

        int len = nums.length;
        for(int i=0;i<(int)Math.pow(2,len);i++){
            List<Integer> tmp = new ArrayList<>();
            if(i==0) rs.add(tmp);
            else {
                char[] bin = Integer.toBinaryString(i).toCharArray();
                for(int j=0;j<bin.length;j++){
                    if(bin[j]=='1') tmp.add(nums[len-bin.length+j]);
                }
                rs.add(tmp);
            }
        }
        return rs;
    }
}