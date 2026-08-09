class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        String s2=s.strip();
        for(int i=s2.length()-1;i>=0;i--){
            char ch=s2.charAt(i);
            if(ch ==' '  && !st.isEmpty()){
                while(!st.isEmpty()){
                    sb.append(st.pop());
                }
                sb.append(ch);

            }else if(ch!=' '){
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
        
    }
}