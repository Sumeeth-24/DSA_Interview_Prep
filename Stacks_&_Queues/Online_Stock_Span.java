class StockSpanner {
    
     class Pair {
        int price;
        int span;
      }
    
    Stack<Pair> st;   

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int total_Span = 1;  // current span of price is 1 which is itself

        while (!st.isEmpty() && st.peek().price <= price) {
            total_Span += st.peek().span;
            st.pop();
        }

        Pair pair = new Pair();
        pair.price = price;
        pair.span = total_Span;
        st.push(pair);

        return total_Span;
    }
}

