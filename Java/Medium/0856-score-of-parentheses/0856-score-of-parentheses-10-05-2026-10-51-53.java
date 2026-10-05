class Solution {
    public int scoreOfParentheses(String s) {

        Stack<Integer> st= new Stack<>();
        st.push(0);
        for(char ch : s.toCharArray()){

            if(ch=='('){
                st.push(0);
            }else{
                int top=st.pop();
                int score=Math.max(top *2,1);
                st.push( st.pop() + score);
            }
        } 
        return st.pop();
        
    }
}