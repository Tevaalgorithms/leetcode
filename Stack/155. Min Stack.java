class MinStack {
    
    class Node {
        int min;
        int data;
        Node next;
        Node(int data, int min) {
            this.data = data;
            this.min = min;
            this.next = null;
        }        
    }

    Node head;
    
    /** initialize your data structure here. */
    public MinStack() {
               
    }
    
    public void push(int x) {
        Node temp;
        if(head == null) {
            temp = new Node(x, x);
        } else {           
           temp = new Node(x, Math.min(x, head.min));
           temp.next = head;
        }
        
        head = temp;
    }
    
    public void pop() {
       if(head != null){
           head = head.next;
       }
    }
    
    public int top() {
        if(head == null) {
            return -1;
        } 
        return head.data;
    }
    
    public int getMin() {
        if(head == null) {
            return -1;
        } 
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
