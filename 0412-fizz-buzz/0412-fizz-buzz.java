class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> rs = new ArrayList<>();
        int i=1;
        while(i<=n){
            int fQuot = i/3;
            int bQuot = i/5;
            int fRemain = i%3;
            int bRemain = i%5;

            if(fRemain==0 && bRemain==0 && fQuot > 0 && bQuot > 0) {
                rs.add("FizzBuzz");
            }else if(fRemain==0 && fQuot > 0){
                rs.add("Fizz");
            }else if(bRemain==0 && bQuot > 0){
                rs.add("Buzz");
            }else{
                rs.add(Integer.toString(i));
            }
            i++;
        }
        return rs;
    }
}