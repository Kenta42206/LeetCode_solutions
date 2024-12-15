// Problem URL: https://leetcode.com/problems/is-subsequence

class Leetcode392 {
    public static boolean isSubsequence(String s, String t) {
        int sPoniter = 0, tPointer = 0;
        while(sPoniter < s.length() && tPointer < t.length() ){
            if(s.charAt(sPoniter) == t.charAt(tPointer)){
                sPoniter += 1;
            }
            tPointer += 1;
        }
        return sPoniter == s.length();
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}