class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;

        char[] vowels = {'a','e','i','o','u'};
        HashMap<Character, Integer> vowelMap = new HashMap<>();
        for(int i=0;i< vowels.length;i++) {
            vowelMap.put(vowels[i], 1);
        }

        int cnt = 0;
        int l = 0, r = 0;
        while (r < s.length()) {
            if (l + k != r) {
                if(vowelMap.containsKey(s.charAt(r++))) cnt++;
            } else {
                char charR = s.charAt(r++);
                char charL = s.charAt(l++);

                if(vowelMap.containsKey(charL)) cnt--;
                if(vowelMap.containsKey(charR)) cnt++;
            }
            if (l + k == r) {
                max = Math.max(cnt,max);
            }
        }
        return max;
    }
}