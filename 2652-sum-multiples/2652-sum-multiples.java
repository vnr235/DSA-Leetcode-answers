class Solution {
    public int sumOfMultiples(int n) {
        int a=0;
        for(int i=1;i<=n;i++){
            if(i%5==0 || i%3==0 || i%7==0){
                a +=i;
            }
        }
        return a;
    }
}