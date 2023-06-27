class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1) {
            String num = String.valueOf(n);
            int tot = 0;
            for(int i=0;i<num.length();i++) {
                tot += Math.pow(num.charAt(i)-'0',2);
            }
            if(set.contains(tot)) return false;
            set.add(tot);
            n = tot;
        }
        return true;
    }
}