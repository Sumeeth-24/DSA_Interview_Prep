// Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
// Output: true
// Explanation: We might do the following sequence:
// push(1), push(2), push(3), push(4),
// pop() -> 4,
// push(5),
// pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        Stack<Integer> st = new Stack<>();
        int m = pushed.length;
        
        int i = 0,  j = 0;
        
        while(i < m && j < m){
            st.push(pushed[i]);
            while(st.size() > 0 && st.peek() == popped[j]){
                st.pop();
                j++;
            }
            i++;
        }
        
        return st.isEmpty();
    }
}