// Given an array arr[ ] of size N having elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.

// Input: 
// N = 4, arr[] = [1 3 2 4]
// Output:
// 3 4 4 -1
// Explanation:
// In the array, the next larger element 
// to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
// since it doesn't exist, it is -1.

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long[] result = new long[n];
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        
        for(int i=1; i < n; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int pos = st.peek();
                result[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        
         while(st.size() > 0){
            int pos = st.peek();
            result[pos] = -1;
            st.pop();
         }
		 return result;
    } 
}