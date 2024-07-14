// i/p: "/a/./b/../..//c/"
// o/p: "/c"

import java.util.*;
class Solution {
    public String simplifyPath(String path) {
       Stack<String> st = new Stack<>();
        StringTokenizer str = new StringTokenizer(path, "/"); 
        
        while(str.hasMoreTokens()){
            {
                String s = str.nextToken();
                System.out.println(s); //   [a, ., b, .., .., c]
                if(s.equals("") || s.equals(".")) continue;
                
                else if(s.equals("..")){
                    if(!st.isEmpty()){
                        st.pop();
                    }
                }
                else{
                    st.push(s);
                }
            }
        }
        
        if(st.isEmpty()){
            return "/";
        }
        
         String result = "";
        
        while(!st.isEmpty()){
            result = "/" + st.peek() + result;
            st.pop();
        }
        return result;
    }
}