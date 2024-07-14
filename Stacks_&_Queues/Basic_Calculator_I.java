// Input: s = "(1+(4+5+2)-3)+(6+8)"
// Output: 23
    
class Solution {
    public int calculate(String s) {
      Stack<Integer> st = new Stack<>();
        int number = 0;
        int result = 0;
        int sign   = 1;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                number  = 10*number + (ch - '0');  // number banate chalo
            } else if(ch == '+') {
                // number ban chuka hoga already
                // result me add karo
                result += sign*number;
                number  = 0;
                sign = 1; //For further
            } else if(ch == '-') {
                 // number ban chuka hoga already
                // result me add karo
                result += sign*number;
                number  = 0;
                sign = -1; //For further
            } else if(ch == '(') {
                st.push(result);
                st.push(sign);
                result = 0;
                number = 0;
                sign = 1;
            } else if(ch == ')') {
                result += sign*number;   // bracket ke andhar ka result hai ye
                number = 0;
               
                int stack_sign = st.pop();
                int last_result = st.pop();
                
                result *= stack_sign;
                result += last_result;
            }
        }
        result += (sign*number);
        return result;
    }
}