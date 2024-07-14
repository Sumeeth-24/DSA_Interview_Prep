//The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.
// Input: 
// N = 7, price[] = [100 80 60 70 60 75 85]
// Output:
// 1 1 1 2 1 4 6

class Solution
{
    public static int[] calculateSpan(int price[], int n)
    {
        int[] span = new int[n];

			            Stack<Integer> st = new Stack<>();
			            st.push(0);
			            span[0] = 1;

			            for (int i = 1; i < n; i++) {
			              while(st.size() > 0 && price[i] >= price[st.peek()]){
			                st.pop();
			              }

			              if(st.size() == 0){
			                span[i] = i + 1;
			              } else {
			                span[i] = i - st.peek();
			              }

			              st.push(i);
			            }

			            return span;
    }
    
}