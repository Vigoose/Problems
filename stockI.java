class stockI {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int min = prices[0], profit = 0;
        for (int price : prices){
            min = Math.min(min, price);
            profit = Math.max(profit, price - min);
        }
        return profit;
        
        
    }
}
