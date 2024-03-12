class Solution {
    public boolean isPalindrome(int x) {
        int a=x, s=0;
        while(x>0){
            int b=x%10;
            s= (s*10) +b;
            x/=10;
        }
        if(a==s){
            return true;
        }
        return false;
    }
}