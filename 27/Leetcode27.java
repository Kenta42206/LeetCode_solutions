// Problem URL: https://leetcode.com/problems/remove-element

class Leetcode27 {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
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