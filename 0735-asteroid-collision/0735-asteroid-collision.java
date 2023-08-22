class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
            int curr = asteroids[i];
            if(stack.isEmpty() || curr > 0) {
                stack.push(curr);
            }else {
                int prev;
                boolean isCurrWin = true;
                while(!stack.isEmpty()) {
                    prev = stack.peek();
                    if(prev < 0) {
                        break;
                    }
                    int calc = prev+curr;
                    if(calc < 0) {
                        stack.pop();
                    }else if(calc == 0){
                        stack.pop();
                        isCurrWin = false;
                        break;
                    }else {
                        isCurrWin = false;
                        break;
                    }
                }
                if(isCurrWin) stack.push(curr);
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}