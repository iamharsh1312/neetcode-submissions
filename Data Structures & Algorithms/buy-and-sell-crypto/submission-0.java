class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int minbuy = prices[0];
        for(int i:prices){
            maxp = Math.max(maxp,i-minbuy);
            minbuy = Math.min(minbuy, i);
        }
        return maxp;
        
    }
}
