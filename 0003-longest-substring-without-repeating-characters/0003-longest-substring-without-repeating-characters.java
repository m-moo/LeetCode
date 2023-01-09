class Solution {
    int cnt = 0;
    int max = 0;
    StringBuilder sum = new StringBuilder();
    
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sum = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.length()-i<max){
                break;
            }
            sum.append(s.charAt(i));
            cnt++;
            for(int j=i+1;j<s.length();j++){
                char next = s.charAt(j);
                if(sum.indexOf(Character.toString(next))<0){
                    sum.append(next);
                    cnt++;
                }else{
                    break;
                }
            }
            max = cnt>max?cnt:max;
            sum.delete(0,sum.length());
            cnt = 0;
        }
        return max;
    }
    
    public void reset() {
        sum.delete(0,sum.length());
        cnt = 0;
    }
}