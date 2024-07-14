// Input: asteroids = [5,10,-5]
// Output: [5,10]
// Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int val : asteroids){
            
            // when collision happens ??
            while(!st.isEmpty() && val < 0 && st.peek() > 0){
                
                int sum = val + st.peek();
                
                if(sum < 0){
                    st.pop();
                } else if (sum > 0){
                    val = 0;
                }
                else {  // sum == 0
                    st.pop();
                    val = 0;
                }
            }
            
            if(val != 0){
                st.push(val);
            }
        }
        
        int size = st.size();
        int[] result = new int[size];
        
        int i = size - 1;
        while(!st.isEmpty()){
            result[i] = st.peek();
            st.pop();
            i--;
        }
        
        return result;
    }
}