class Solution {
    public int maxDepth(String s) {
        int c=0,mc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c++;
            }
            if(s.charAt(i)==')'){
                c--;
            }
            mc=Math.max(mc,c);
        }
        return mc;
    }
}