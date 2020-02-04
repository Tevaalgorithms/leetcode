class Solution {
    public int largestRectangleArea(int[] heights) {
        
        if(heights == null || heights.length == 0) {
            return 0;
        }
        
        int topArea = 0;
        int maxArea = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        int index = 0;
        
        while(index < heights.length) {
            if(st.isEmpty() || heights[st.peek()] <= heights[index]){
                st.push(index++);
            } else {
                topArea = calculateArea(index, st, heights);
                maxArea = Math.max(maxArea, topArea);
            }
        }
        
        while(!st.isEmpty()) {
            topArea = calculateArea(index, st, heights);
            maxArea = Math.max(maxArea, topArea);
        }
        
        return maxArea;        
    }
    
    private int calculateArea(int index, Stack<Integer> st, int[] height) {
        int temp = st.pop();
        
        int area = height[temp];
        
        if(st.isEmpty()) {
            area = area * index;
        } else {
            area = area * (index - st.peek() - 1);
        }
        
        return area;
    }
}
