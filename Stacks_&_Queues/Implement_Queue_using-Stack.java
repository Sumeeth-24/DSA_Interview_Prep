// Approach 1 push(x) -> s1 to s2, x to s1, s2 to s1 where s1 and s2 are stack s1 and stack s2

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        if(!output.isEmpty()){
           return output.pop();
        }
        else {
            while(!input.isEmpty()){
               output.push(input.pop());
            }
        }
         return output.pop();
    }
    
    public int peek() {
        if(!output.isEmpty()){
           return output.peek();
        }
        else {
            while(!input.isEmpty()){
               output.push(input.pop());
            }
        }
        return output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}
