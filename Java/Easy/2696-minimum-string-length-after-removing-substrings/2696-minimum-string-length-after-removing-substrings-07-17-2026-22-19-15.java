class Solution {
    public int minLength(String s) {

        // Stack<Character> st=new Stack<>();
        // for(char ch:s.toCharArray()){
        //    if( !st.isEmpty() && st.peek() == 'A' && ch == 'B' ){
        //     st.pop();

        //    }else if( !st.isEmpty() && st.peek() == 'C' && ch == 'D'){
        //     st.pop();
        //    }else{
        //     st.push(ch);
        //    }
        // }
        // return st.size();

        StringBuilder sb=new StringBuilder("");
        for(char ch: s.toCharArray()){

            int length=sb.length();

            if(length > 0 && sb.charAt(length-1)=='A' && ch=='B' ){
                sb.deleteCharAt(length-1);
            }
             else if(length > 0 && sb.charAt(length-1)=='C' && ch=='D' ){
                sb.deleteCharAt(length-1);
            }else{
                sb.append(ch);
            }
        }
        return sb.length();
        
    }
}