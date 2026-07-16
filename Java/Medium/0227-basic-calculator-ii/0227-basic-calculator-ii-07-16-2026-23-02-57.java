class Solution {
    public int calculate(String s) {

        Stack<Integer> st=new Stack<>();
        char sign='+'; // first sign is + it track sign not push in stack
        int num=0; //  it use to conver char to num and also add in stack not directly only if any perater come


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            //conver char to num only if ch is digit not for operator
            if(Character.isDigit(ch)){
                num= num * 10 + (ch-'0');
            }

             // If current character is an operator or we've reached the end becuse if end come no need to check it is operator or not
            if(( !Character.isDigit(ch) && ch != ' ' ) || i==s.length()-1 ){

                if(sign=='+'){
                    st.push( num );

                }else if(sign == '-'){
                    st.push( -num );

                }else if(sign == '*'){
                    st.push(st.pop() * num );

                }else if(sign== '/'){
                    st.push(st.pop() / num );

                }

                sign=ch; // change sign store curr sign for next operation
                num=0; // after operation restart num 

            }


        }
        int ans=0;
        while(!st.isEmpty()){
           
            ans+=st.pop();

        }
        return ans;
        
    }
}