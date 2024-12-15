// Problem URL: https://leetcode.com/problems/longest-common-prefix

class Leetcode14 {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;   
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}