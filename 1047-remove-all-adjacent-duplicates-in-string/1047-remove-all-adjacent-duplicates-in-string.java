class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!st.isEmpty()){
                if(st.peek() == ch[i]){
                    st.pop();
                    continue;
                }
                else{
                    st.push(ch[i]);
                }
            }
            else{
                st.push(ch[i]);
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();

    }
}