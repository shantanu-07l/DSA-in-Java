class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder sb=new StringBuilder();
        int open=0;
        for(char ch:s.toCharArray()){

            if(ch=='('){
                open++;
                sb.append(ch);
            }else if(ch==')'){

                if(open > 0){
                    open--;
                    sb.append(ch);

                }
            }else{
                sb.append(ch);//for charcter
            }

        }
        StringBuilder ans=new StringBuilder();
        int close=0;
        for(int i=sb.length()-1;i>=0;i--){
            char ch=sb.charAt(i);

            if(ch==')'){
                close++;
                ans.append(ch);
            }else if(ch=='('){

                if(close > 0){
                    close--;
                    ans.append(ch);
                }
            }else{
                ans.append(ch);
            }


        }
        return ans.reverse().toString();

        
        
    }
}