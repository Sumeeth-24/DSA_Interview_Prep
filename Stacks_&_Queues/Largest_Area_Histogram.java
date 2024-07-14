// Input: heights = [2,1,5,6,2,3]
// Output: 10


class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> st = new Stack<>();
        int maxArea =0;
        
        st.push(-1);
        
        for(int i=0;i<=heights.length;i++){
            int val = i==heights.length? 0:heights[i];
            
            while(st.peek() != -1 && heights[st.peek()] >= val){
                int rm = i;
                int h = heights[st.pop()];
                int lm = st.peek();
                maxArea = Math.max(maxArea, h*(rm- lm-1));
            }
            st.push(i);
        }
        
        return maxArea;
    }
}