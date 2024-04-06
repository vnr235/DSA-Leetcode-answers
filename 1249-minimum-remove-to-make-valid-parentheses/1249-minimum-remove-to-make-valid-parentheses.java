class Solution {
    public String minRemoveToMakeValid(String s) {
        int count = 0, su = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                if (count > 0) {
                    count--; 
                } else {
                    s = s.substring(0, i) + s.substring(i + 1);
                    i--;
                }
            }
        }
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - 1; i >= 0 && count > 0; i--) {
            if (sb.charAt(i) == '(') {
                sb.deleteCharAt(i);
                count--; 
            }
        }
        return sb.toString();
    }
}
