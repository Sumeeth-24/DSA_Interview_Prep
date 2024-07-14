// Input: s = "()))(("
// Output: 4

class Solution {
    public int minAddToMakeValid(String S) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < S.length(); i++){
            char ch = S.charAt(i);
            
            if(ch == '('){
                st.push(ch);
            } else {
                if(st.size() > 0 && st.peek() == '('){
                    st.pop();
                } else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}

// O(1) Space
class Solution {
    public int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int closeBrackets = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                openBrackets++;
            }else{
                if(openBrackets!=0) openBrackets--;
                else closeBrackets++;
            }
        }
        int res = openBrackets+closeBrackets;
        return res;
    }
}