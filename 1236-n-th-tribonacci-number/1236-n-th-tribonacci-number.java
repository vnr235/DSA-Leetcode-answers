class Solution {
    public int tribonacci(int n) {
       if(n==0){
           return 0;
       }
       if(n==1 || n==2){
           return 1;
       }
       int as[]=new int[n+1];
       as[0]=0;
       as[1]=1;
       as[2]=1;
       for(int i=3;i<=n;i++){
           as[i]=as[i-1]+as[i-2]+as[i-3];
       }
       return as[n];
    }
}