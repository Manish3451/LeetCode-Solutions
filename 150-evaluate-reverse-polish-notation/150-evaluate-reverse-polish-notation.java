class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token : tokens){
            if(token.equals("+")){
                st.add(st.pop()+st.pop());
            }
            else if(token.equals("-")){
                int a = st.pop();
                int b = st.pop();
                st.add(b-a);
            }
            else if(token.equals("*")){
                st.add(st.pop()*st.pop());
            }
            else if(token.equals("/")){
                int a = st.pop();
                int b = st.pop();
                st.add(b/a);
            }
            else{
                st.add(Integer.parseInt(token));
            }
        }
        return st.pop();
    }
}