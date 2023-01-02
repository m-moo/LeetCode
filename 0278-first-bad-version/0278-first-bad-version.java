/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        
        while(right-left>1){
            int mid = left+(right-left)/2;
            boolean rs = isBadVersion(mid);
                
            if(rs){
                right = mid;
            }else if(!rs){
                left = mid;
            }

        }
        return right;
    }
}