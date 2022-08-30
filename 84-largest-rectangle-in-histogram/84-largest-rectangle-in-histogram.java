class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer> st = new Stack<>();
        int n = heights.length;
       
        int [] rb = new int[n];
        
        st.push(n-1);
        
        rb[n-1] = n ;
        
        for(int i = n-2; i >=0; i--){
            while(st.size() > 0 && heights[i]  <= heights[st.peek()] ){
                st.pop();
            }
            if(st.size()==0){
                rb[i] = n;
            }
            else{
                rb[i] = st.peek();
            }
            st.push(i);
        }
        
        
        
        int [] lb = new int[n];
        st = new Stack<>();
        st.push(0);
        
        lb[0] = -1;
       
        for(int i = 1; i < n; i++){
            while(st.size() > 0 && heights[i]  <= heights[st.peek()] ){
                st.pop();
            }
            if(st.size()==0){
                lb[i] = -1;
            }
            else{
                lb[i] = st.peek();
            }
            st.push(i);
        }
        
        int maxarea = 0; 
        for(int i = 0; i < n; i++){
           int width = rb[i] - lb [i] - 1;
           int area = heights[i]*width;
            if(area > maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }
}