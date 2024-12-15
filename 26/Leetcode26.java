// Problem URL: https://leetcode.com/problems/remove-duplicates-from-sorted-array

class Leetcode26 {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}