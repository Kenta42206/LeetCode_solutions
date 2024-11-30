

class Leetcode2239 {
    public static int findClosestNumber(int[] nums) {
        int closest = nums[0];
        for(int num : nums){
            if(Math.abs(num) < Math.abs(closest) || num == Math.abs(closest)){
                closest = num;
            }
        }
        return closest;
        
    }
    public static void main(String[] args) {
        int[] numList1 = new int[]{-4,-2,1,4,8};
        int ans1 = findClosestNumber(numList1);
        System.out.println(ans1);
        int[] numList2 = new int[]{2,-1,1};
        int ans2 = findClosestNumber(numList2);
        System.out.println(ans2);
        int[] numList3 = new int[]{2,1,1,-1,100000};
        int ans3 = findClosestNumber(numList3);
        System.out.println(ans3);
    }
}