class Solution {
    HashSet<String> set;
    String origin;

    public List<String> restoreIpAddresses(String s) {        
        origin = s;
        set = new HashSet<>();
        backTrack(s, new ArrayList<>());
        return set.stream().toList();
    }

    public void backTrack(String s, List<String> ip) {
        if(ip.size() == 4) {
            if(s.isEmpty()) {
                String sum = String.format("%s%s%s%s", ip.get(0),ip.get(1),ip.get(2),ip.get(3));
                if(sum.equals(origin)) {
                    set.add(String.format("%s.%s.%s.%s",
                        ip.get(0),ip.get(1),ip.get(2),ip.get(3)));
                }
            }
            return;
        }

        for(int i=1;i<4;i++) {
            if(s.length() < i) continue;
            int num = Integer.parseInt(s.substring(0,i));

            int lastPossiblePart = s.substring(i).length()/3 +
                (s.substring(i).length()%3>0?1:0);
            if(num > 255 || lastPossiblePart > 4-ip.size()) continue;
            ip.add(Integer.toString(num));
            backTrack(s.substring(i), ip);
            ip.remove(ip.size()-1);
        }
    }
}