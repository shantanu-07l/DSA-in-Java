class Solution {
    public int maximalRectangle(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int height[] = new int[col];

        int maxArea=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {//check char  becuse given char
                    height[j] += 1;//add not restart becuse we count next row also add from prevous row 
                }else{
                    height[j] = 0;
                }
            }
            maxArea=Math.max(maxArea , largestRectangleArea(height));
        }
        return maxArea;

        
    }
    public int largestRectangleArea(int[] heights) {
        int maxArea=0;
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<=heights.length;i++){

            int h=(i==heights.length) ? 0 : heights[i];

            while(!st.isEmpty() && h < heights[st.peek()]){

                int height=heights[st.peek()];
                st.pop();
                int width=st.isEmpty() ? i:i - st.peek() -1;//-1 becuse if stack pop then 

                int area=height * width;
                maxArea=Math.max(maxArea,area);

            }
            st.push(i);
        }
        return maxArea;
        
    }
}