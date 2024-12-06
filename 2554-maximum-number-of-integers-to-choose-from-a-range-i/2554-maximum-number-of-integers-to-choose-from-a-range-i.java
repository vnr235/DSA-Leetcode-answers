class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0, sum=0;
        for(int i=1;i<=n;i++){
            boolean ban= false;
            for(int j=0; j<banned.length; j++){
                if (i == banned[j]){
                    ban= true;
                    break;
                }
            }
            if(!ban && sum + i <= maxSum){
                count++;
                sum += i;
            }
        }
        return count;
    }
}