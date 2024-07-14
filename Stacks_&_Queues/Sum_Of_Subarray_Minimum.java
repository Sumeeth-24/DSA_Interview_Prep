// Input: arr = [3,1,2,4]
// Output: 17
// Explanation: 
// Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
// Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
// Sum is 17.


//T.C : O(n)
//S.C : O(n)

public class Solution {
    public int[] getNSL(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return result;
    }

    public int[] getNSR(int[] arr, int n) {
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            result[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return result;
    }

    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;

        int[] NSL = getNSL(arr, n);
        int[] NSR = getNSR(arr, n);

        long sum = 0;
        int M = 1000000007;

        for (int i = 0; i < n; i++) {
            long d1 = i - NSL[i];
            long d2 = NSR[i] - i;
            
            long totalWaysForIMin = d1 * d2;
            long sumIInTotalWays = arr[i] * totalWaysForIMin;

            sum = (sum + sumIInTotalWays) % M;
        }

        return (int) sum;
    }
}