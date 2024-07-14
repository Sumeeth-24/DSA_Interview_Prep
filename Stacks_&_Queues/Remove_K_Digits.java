// Input:
// S = "1002991", K = 3
// Output: 
// 21
// Explanation: 
// Remove the three digits 1(leading
// one), 9, and 9 to form the new number 21(Note
// that the output must not contain leading
// zeroes) which is the smallest.

class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k >= num.length())
            return "0";
        
        if(k == 0)
            return num;
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < num.length(); i++){
            char c = num.charAt(i);
            
            while(!st.isEmpty() && (k > 0) && (st.peek() > c)){
                st.pop();
                k--;
            }
            
            if(!st.isEmpty() || (c != '0')){
                st.push(c);
            }
        }
        
        // will also help in strictly ascending order
        while(!st.isEmpty() && (k > 0)){
            k--;
            st.pop();
        }

   	  char ans[] = new char[st.size()];
        int h = ans.length - 1;
        while(h >= 0) ans[h--] = st.pop();
        
        int d = 0;
        while(d < ans.length && ans[d] == '0') d++;
        
        StringBuilder sb = new StringBuilder();
        
        while(d < ans.length) sb.append(ans[d++]);
        
        if(sb.length() == 0) sb.append('0');
        
        return sb.toString();
    }
}
