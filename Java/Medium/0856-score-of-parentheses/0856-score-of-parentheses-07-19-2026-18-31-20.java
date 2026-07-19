class Solution {
    public int scoreOfParentheses(String s) {
        // int open=0;
        // int close=0;
        // int count=0;
        // for(char ch:s.toCharArray()){

        //     if(ch=='('){
        //         open++;
        //     }else if(open <= 0){
        //         close++;
        //     }else{
        //         open--;
        //         count++;
        //     }
        // }
        // return count;

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