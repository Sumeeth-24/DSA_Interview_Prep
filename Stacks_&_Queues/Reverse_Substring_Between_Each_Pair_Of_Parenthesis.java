// Input: s = "(ed(et(oc))el)"
// Output: "leetcode"

class Solution {
   public String reverseParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                // reverse last part in char array
                int first = stack.pop();
                reverse(chars, first, i);
            }
        }

		// create final result, exclude brackets
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (c != '(' && c != ')') {
                sb.append(c);
            }
        }
        return sb.toString();
    }

	private void reverse(char[] arr, int from, int to) {
        while(from < to) {
            char temp = arr[from];
            arr[from++] = arr[to];
            arr[to--] = temp;
        }
    }

}