class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int a=0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k){
                a += Math.min(tickets[i],tickets[k]);
            }
            else{
                a += Math.min(tickets[i], tickets[k]-1);
            }
        }
        return a;
    }
}