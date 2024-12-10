class Leetcode35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = 0;
        boolean isExist = false;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid]==target){
                res = mid;
                isExist = true;
                break;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return isExist ? res : left;
    }
    
    public static void main(String[] args) {
        int res = 0;
        System.out.println(res);
    }
}