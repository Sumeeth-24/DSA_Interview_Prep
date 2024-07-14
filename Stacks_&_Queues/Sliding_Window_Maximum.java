// T.C  O(N) + O(N)  ~ O(N)
// S.C  O(k) at max k size ele is stored in dequeue

// N = 9, K = 3
// arr[] = 1 2 3 1 4 5 2 3 6
// Output: 
// 3 3 4 5 5 5 6

class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            // remove numbers out of range k
            if (!q.isEmpty() && q.peekFirst() == i - k) {
                q.pollFirst();
            }
            
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) {
                q.pollLast();
            }
            
            q.offer(i);
            if (i >= k - 1) {
                result.add(arr[q.peekFirst()]);
            }
        }
        return result;
    }
}
