// Input: s = "abbaca"
// Output: "ca"

class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < S.length(); i++){
            if(!st.isEmpty() && st.peek() == S.charAt(i)){
                st.pop();
            } else {
                st.push(S.charAt(i));
            }
        }
        
        for(Character ch : st){
            sb.append(ch);
        }
        return sb.toString();
    }
}