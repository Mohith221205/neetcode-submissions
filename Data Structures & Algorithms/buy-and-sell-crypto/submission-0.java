class Solution {
    public int maxProfit(int[] prices) {
        
        int ans=0;
        int p=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<p){
                p=prices[i];
            }
            else{
                ans=Math.max(ans,prices[i]-p);
            }
        }
        return ans;
    }
}
