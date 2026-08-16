class Solution {
        public int operate(int a, int b, String s) {
        if (s.equals("+"))
            return a + b;

        if (s.equals("-"))
            return a - b;

        if (s.equals("*"))
            return (int) ((long) a * (long) b);

        if (s.equals("/"))
            return a / b;

        return -1;
    }
    public int evalRPN(String[] tokens) {
        int res = 0;
        Stack<Integer>st = new Stack<>();
        

        for(String s:tokens){
        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
         
            int b=st.pop();
            int a=st.pop();
            res = operate(a,b,s);
            st.push(res);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
        
    }
}
