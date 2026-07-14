class CustomStack {
    int stack[];
    int maxSize;
    int top;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        stack=new int[maxSize];
        top=-1;
        
    }
    
    public void push(int x) {
        if(top==maxSize -1){
            return;
        } 
        top++;
        stack[top]=x;
        
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        int result=stack[top];
        top--;
        return result;
        
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(top+1,k);//check top of stack because top store index and k which is less till change val
        //e.g if k =100 ans maxsize =3 then all stack need to change then limit is maxsize
        for(int i=0;i<limit;i++){
            stack[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */