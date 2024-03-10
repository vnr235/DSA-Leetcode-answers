class Solution {
    public int maxProfit(int[] prices) {
        int m=0;
        int s=prices[0], len=prices.length;
        for(int i=1;i<len;i++){
            if(s<prices[i]){
                m+=prices[i]-s;
            }
            s=prices[i];
        }
        return m;
    }
}