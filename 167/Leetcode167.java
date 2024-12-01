class Leetcode167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int total;

        while(left <= right){
            total = numbers[left] + numbers[right];

            if(total == target){
                break;
            } else if(total < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[]{left + 1, right + 1};
    }

    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}