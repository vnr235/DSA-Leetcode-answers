class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a=arrivalTime + delayedTime;
        if(a==0 || a==24){
            return 0;
        }
        else if(a>24){
            a=a-24;
        }
        return a;
    }
}