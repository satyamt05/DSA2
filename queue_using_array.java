class MyQueue {
    int q[] = new int[1000];
    int pos=0;
    int temp=0;
    int t=0;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(pos==q.length){
            return;
            }
            else{
                q[pos]=x;
                pos++;
            }
    }
    
    public int pop() {
        if(empty()){
           return 1;
        }
    t= q[temp];
    temp++;
    if(temp==pos){
        temp=0;
        pos=0;
    }
    return t;
    }
    
    public int peek() {
        if(empty()){
            return 1;
        }
        return q[temp];
    }
    
    public boolean empty() {
        if(temp==0 && pos==0){
            return true;
        }
        if(temp==pos){
            temp=0;
            pos=0;
            return true;
        }
        return false;
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