// Input: s = "lee(t(c)o)de)"
// Output: "lee(t(c)o)de"
// Explanation: "lee(t(co)de)" , "lee(t(c)ode)" would also be accepted.
    
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char chs[] = s.toCharArray();
        
        for(int i=0;i<chs.length;i++){
            char ch= chs[i];
            
            if(ch =='('){
                st.push(i);
            }
            else if(ch == ')'){
                if(st.size() == 0){
                    chs[i] = '.';
                } else {
                    st.pop();
                }
            }
        }
        
         while(st.size() > 0){
            chs[st.pop()] = '.';
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(char c:chs){
            if(c!='.'){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}