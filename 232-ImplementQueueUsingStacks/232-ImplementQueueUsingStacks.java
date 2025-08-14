// Last updated: 8/14/2025, 3:46:58 PM
class MyQueue {
    Stack<Integer> st=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st.push(x);
        
    }
    
    public int pop() {
        return func(st);

        
    }
    public static int func(Stack<Integer> st){
        if(st.size()==1){
           return st.pop();
            
        }
        
       int x= st.pop();
        int val=func(st);
       st.push(x);
       return val;
    }
    public static int func2(Stack<Integer> st){
        if(st.size()==1){
           return st.peek();
            
        }
        
       int x= st.pop();
        int val=func2(st);
       st.push(x);
       return val;
    }
    
    public int peek() {
        return func2(st);
       
        
    }
    
    public boolean empty() {
        return st.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */