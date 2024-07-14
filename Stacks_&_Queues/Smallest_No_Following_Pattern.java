// Input: pattern = "IIIDIDDD"
// Output: "123549876"
    
class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        Stack<Integer> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for(int i=0; i < n; i++){
            char ch = pattern.charAt(i);
            if(ch == 'D'){
                st.push(count);
                count++;
            }
            else{
                st.push(count);
                count++;
                
                while(st.size() > 0){
                    result.append(st.pop());
                }
            }
        }
        
        st.push(count);
         while(st.size() > 0){
            result.append(st.pop());
         }
        
        return result.toString();
    }
}