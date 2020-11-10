class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE; //247875577
        int max_profit = 0;
        for (int i = 0; i < prices.length; i++) {
           if (prices[i] < minValue) { // 2  4 1
              minValue = prices[i];  // 2 1
           } else if (prices[i] - minValue > max_profit) {
              max_profit = prices[i] - minValue; // 4
           }  
        }
        
        return max_profit;
    }
}

public static void main(String[] args) {
    private int[] input = new int[] {2, 4, 1};
    System.out.println(maxProfit(input));
}