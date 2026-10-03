class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);//store index
        int max=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                st.pop();//not give error for stack is empty becuse firstwe push -1 in stack
                if(st.isEmpty()){
                    st.push(i);

                }else{
                    max= Math.max( max, i-st.peek() );
                }
            }
        }
        return max;
        
    }
}