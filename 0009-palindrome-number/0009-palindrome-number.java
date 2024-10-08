class Solution {
    public boolean isPalindrome(int x) {
        int or=x;
        int sum=0;
        while(x>0){
            int b= x%10;
            sum= sum*10+b;
            x=x/10;
        }
        if(or == sum){
            return true;
        }
        return false;
    }
}