class Solution {
    public String makeGood(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            
            if(!st.isEmpty()){
                if(Character.isUpperCase(ch)){
                    if(Character.isLowerCase(st.peek())){
                        if(  Character.toLowerCase(ch) == st.peek()){
                            st.pop();
                        }else{
                            st.push(ch);
                        }

                    }else{

                        st.push(ch);

                    }
                    
                    
                }else{
                    if(Character.isUpperCase(st.peek())){
                        if(  Character.toUpperCase(ch) == st.peek()){
                            st.pop();
                        }else{
                            st.push(ch);
                        }

                    }else{

                        st.push(ch);

                    }
                    
                }
                

            }else{
                st.push(ch);
            }
        }

        StringBuilder ans=new StringBuilder();
       while(!st.isEmpty()){
            ans.insert(0,st.pop());
       }
        return ans.toString();
    }
}