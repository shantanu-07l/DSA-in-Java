class MinStack {
    Stack<Long> s;
    long min;

    public MinStack() {
        s=new Stack<>();

    }
    
    public void push(int value) {
        if(s.isEmpty()){
            s.push((long) value);
            min=(long) value;
        }else if(value < min){
            s.push(2L * value - min);
            min=(long) value;
        }else{
            s.push((long)value);
        }
        
    }
    
    public void pop() {
        if(s.isEmpty()) return;
        long top=s.pop();
        if(top < min){
            min=2 * min - top;
        }
        
    }
    
    public int top() {
        if(s.isEmpty()) return -1;
        long top=s.peek();
        return (top < min) ? (int) min : (int) top;
        
    }
    
    public int getMin() {
        if(s.isEmpty()) return -1;
        return (int) min;
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */