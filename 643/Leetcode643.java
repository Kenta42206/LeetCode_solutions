// Problem URL: https://leetcode.com/problems/maximum-average-subarray-i

class Leetcode643 {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }


        double max_avg = sum / k;

        for (int i = k; i < nums.length; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            System.out.println(i + "回目 sum： " + sum);

            double avg = sum / k;
            System.out.println(i + "回目 avg： " + avg);

            max_avg = Math.max(max_avg, avg);
        }

        return max_avg;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}