class MinStack {
    
    class Node {
        int min;
        int data;
        
        Node next;
        
        Node(int data, int min) {
            this.min = min;
            this.data = data;
        }
    }
    
    Node head;
    
    public void push(int data) {
        Node temp;
        if(head == null) {
            temp = new Node(data, data);
        } else {
            temp = new Node(data, Math.min(head.min, data));
            temp.next = head;
        }
        
        head = temp;
    }
    
    public int getMin() {
        if(head == null) {
            return -1;
        }
        return head.min;
    }
    
    public void pop() {
        if(head != null) {
            head = head.next;
        }
    }
    
    public int top() {
        if(head == null) {
            return -1;
        } 
        return head.data;
    }
      
    /** initialize your data structure here. */
    public MinStack() {
        
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

// Time Complexity: O(1)
// Space Complexity: O(N)
