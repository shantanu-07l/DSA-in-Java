
// class Solution {
//     public int minAddToMakeValid(String s) {
//         int totel = 0;
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i) == '('){
//                 count++;
//             }
//             else if(count<=0){
//                 totel++;
//             }
//             else{
//                 count--;
//             }
//         }
//         return (totel+count);
//     }
// }
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && ch==')' && st.peek() == '(' ){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        return st.size();
        
        
    }
}