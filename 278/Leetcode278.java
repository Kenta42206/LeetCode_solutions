// Problem URL: https://leetcode.com/problems/first-bad-version

class Leetcode278 {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        int res = 1;

        while(left <= right){
            int center = left + (right - left) / 2;
            if(isBadVersion(center)){
                right = center - 1;
                res = center;
            } else {
                left = center + 1;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}