// Problem URL: https://leetcode.com/problems/best-time-to-buy-and-sell-stock

class Leetcode121 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int ans = 0;
        
        for(int i = 1; i < prices.length; i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > ans){
                ans = profit;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println("This is a template for Leetcode");
    }
}