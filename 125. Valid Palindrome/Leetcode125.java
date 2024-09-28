class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        System.out.println(newS);

        int head = 0;
        int tail = newS.length() - 1;

        return isPalindromeHelper(head, tail, newS);
    }

    public static boolean isPalindromeHelper(int head, int tail, String s){
        if(head > tail) return true;

        if(s.charAt(head) == s.charAt(tail)) return isPalindromeHelper(head + 1, tail - 1, s);
        else return false;
    }
}