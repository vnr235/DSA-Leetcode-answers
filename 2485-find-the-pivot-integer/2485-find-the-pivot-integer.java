class Solution {
    public int pivotInteger(int n) {
        // int temp=0,s=0;
        // for(int i=1;i<=n;i++){
        //     int s+=i;
        // }
        int s= (n+1)*n/2;
        int p=(int)Math.sqrt(s);
        return p*p==s?p:-1;
    }
}