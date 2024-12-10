// Problem URL: https://leetcode.com/problems/climbing-stairs

class Leetcode70 {

    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;

        int twoBack = 1;
        int oneBack = 2;

        for (int i = 2; i < n; i++) {
          int next = twoBack + oneBack;
          twoBack = oneBack;
          oneBack = next;   
        }

        return oneBack;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}