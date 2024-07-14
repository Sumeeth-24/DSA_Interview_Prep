// Input:
// N = 5
// arr[ ] = {3, 8, 4, 1, 2}
// Output: {8, -1, 8, 2, 3}

class Solution {
    static int[] nextGreaterElement(int N, int arr[]) {
        int[] result = new int[N];
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = N - 2; i >= 0; i--){
            while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            st.push(arr[i]);
        }
        
        for(int i= N - 1; i >= 0; i--){
             while(st.size() > 0 && st.peek() <= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                result[i] = -1;
            }
            else{
                result[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }
}