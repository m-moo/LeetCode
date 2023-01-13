class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        int len1 = s1.length();

        for(int i=0;i<len1;i++){
            map[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            map[s2.charAt(i)-'a']--;
            // 지나간 문자열에 순열이 없다면 다시 0으로 복원시킴
            if(i-len1 >= 0) map[s2.charAt(i-len1)-'a']++;
            if(isAllZero(map)) return true;
        }
        return false;
    }
    
    public boolean isAllZero(int[] map){
        for(int i=0;i<map.length;i++){
            if(map[i] != 0) return false;
        }
        return true;
    }
}