class MyQueue {
    
    Stack<Integer> incoming;    
    Stack<Integer> outgoing;
    private int front;    
 
    /** Initialize your data structure here. */
    public MyQueue() {
        incoming = new Stack<>();    
        outgoing = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
       if(incoming.isEmpty()) {
           front = x; 
       }
       
       while(!incoming.isEmpty()) {
           outgoing.push(incoming.pop()) ;
       }
       
       outgoing.push(x);
        
       while(!outgoing.isEmpty()) {
          incoming.push(outgoing.pop()) ;
       }
       
    }
    
  
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       if(incoming.isEmpty()){
           return front;
       }
      return incoming.pop();
    }
    
    /** Get the front element. */
    public int peek() {       
        return incoming.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {       
        return incoming.isEmpty();
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
