class Solution {
    public int buyChoco(int[] prices, int money) {
        int mini=Math.min(prices[0],prices[1]);
        int maxi=Math.max(prices[0],prices[1]);
        for(int i=2;i<prices.length;i++){
            if(prices[i]<mini){
                maxi=mini;
                mini=prices[i];
            }
            else if(prices[i]<maxi){
                maxi=prices[i];
            }
        }
        int ans=mini+maxi;
        if(ans<=money){
            return money-ans;
        }
        return money;
    }
}