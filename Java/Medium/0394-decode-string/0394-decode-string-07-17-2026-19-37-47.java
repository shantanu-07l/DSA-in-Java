class Solution {
    public String decodeString(String s) {

        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){

            if(ch != ']'){
                st.push(ch);

            }else{
                StringBuilder str=new StringBuilder();
                while(st.peek() != '['){
                    str.insert(0,st.pop());
                }
                st.pop();//remove "["

                StringBuilder num=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                int repeat =Integer.parseInt(num.toString());

                StringBuilder repeated=new StringBuilder();
                for(int i=0;i<repeat;i++){
                    repeated.append(str);//append final answer
                }
                for(char c:repeated.toString().toCharArray()){
                    st.push(c);
                }
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.insert(0,st.pop());
        }
        
        return ans.toString();
    }
}