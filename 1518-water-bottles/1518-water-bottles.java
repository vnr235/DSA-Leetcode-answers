class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int s=numBottles;
        while(numBottles>=numExchange){
            int a=numBottles/numExchange;
            s+=a;
            int x = numBottles%numExchange;
            numBottles=a+x;
        }
        return s;
    }
}