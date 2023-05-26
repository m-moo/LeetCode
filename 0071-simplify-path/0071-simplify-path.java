class Solution {
    public String simplifyPath(String path) {
        StringBuilder answer = new StringBuilder();

        String[] paths = path.split("/");
        Stack<String> st = new Stack<>();
        for(int i=0;i<paths.length;i++) {
            String dir = paths[i];
            if(dir.equals(".") || dir.isEmpty()) continue;
            else if(dir.equals("..")) {
                if(!st.isEmpty()) st.pop();
            }else st.add(dir);
        }

        for(String dir:st) {
            answer.append("/");
            answer.append(dir);
        }
        if(st.isEmpty()) answer.append("/");
        return answer.toString();
    }
}