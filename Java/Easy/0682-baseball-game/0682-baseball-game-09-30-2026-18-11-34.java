class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String ch=operations[i];
            if(ch.equals("C")){
                st.pop();

            }else if(ch.equals("D")){
                int n=st.peek() *2;
                st.push(n);

            }else if(ch.equals("+")){
                int l=st.pop();
                int ans=st.peek() + l;
                st.push(l);
                st.push(ans);

            }else{
                int num=Integer.parseInt(ch);
                st.push(num);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
        
    }
}