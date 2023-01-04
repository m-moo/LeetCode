class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] rs = new int[2];
        for(int i=0;i<numbers.length;i++){
            int n = numbers[i];
            int m = target-n;

            if(numbers[numbers.length-1]>=m) {
                int left = i+1, right = numbers.length-1;
                while(left<=right) {
                    int mid = left + (right-left)/2;
                    if(numbers[mid]==m){
                        rs[0] = i+1;
                        rs[1] = mid+1;
                        return rs;

                    }else if(numbers[mid]>m) {
                        right = mid-1;
                    }else {
                        left = mid+1;
                    }
                }
            }
        }
        return rs;
    }
}