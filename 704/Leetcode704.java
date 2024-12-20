class Leetcode704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                res = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}