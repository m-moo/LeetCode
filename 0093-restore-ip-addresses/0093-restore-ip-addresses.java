class Solution {
    int len;
    List<String> ipList;

    public List<String> restoreIpAddresses(String s) {        
        len = s.length();
        ipList = new ArrayList<>();
        backTrack(s,0, "", 0);
        return ipList;
    }

    public boolean isIp(String ip) {
        if(ip.length() > 3 || ip.length() == 0) return false;
        if(ip.length() > 1 && ip.charAt(0) == '0') return false;
        if(ip.length() > 0 && Integer.parseInt(ip) > 255) return false;
        return true;
    }

    public void backTrack(String s, int idx, String ip, int dot) {
        if(dot == 3) {
            if(isIp(s.substring(idx))) {
                ip += s.substring(idx);
                ipList.add(ip);
            }
            return;
        }

        for(int i=idx;i<len;i++) {
            if(isIp(s.substring(idx, i+1))) {
                int k = s.substring(idx, i+1).length();
                ip += s.substring(idx, i+1) + ".";
                backTrack(s, i+1, ip, dot+1);
                ip = ip.substring(0, ip.length()-k-1);
            }
        }
    }
}