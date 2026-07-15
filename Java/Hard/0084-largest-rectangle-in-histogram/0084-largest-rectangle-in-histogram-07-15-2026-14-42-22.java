class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<=heights.length;i++){

            int h=(i==heights.length) ? 0 : heights[i];

            while(!st.isEmpty() && h < heights[st.peek()]){

                int height=heights[st.peek()];
                st.pop();
                int width=st.isEmpty() ? i:i - st.peek() -1;

                int area=height * width;
                maxArea=Math.max(maxArea,area);

            }
            st.push(i);
        }
        return maxArea;
        
    }
}