// Last updated: 8/14/2025, 3:47:35 PM
class MinStack {
    long min=Integer.MAX_VALUE;
    Stack<Long> st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)(val));
            min=val;
        }
        else{
            if(min>val){
                st.push(2L*val-min);
                min=val;
            }
            else{
                st.push((long)(val));
            }
        }
        
    }
    
    public void pop() {
        if(st.peek()<min){
            long x=st.pop();
            min=2*min-x;
        }
        else{
            st.pop();
        }
        
        
    }
    
    public int top() {
        if(st.peek()<min){
            return (int)(min);
        }
        else{
            long t=st.peek();
            return (int)(t);
        }

        
    }
    
    public int getMin() {
        return (int)(min);
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */