class Solution
{ 
    
    int celebrity(int M[][], int n)
    {
    	Stack<Integer> st = new Stack<>();
    	
    	for(int i=0; i < n; i++){
    	    st.push(i);
    	}
    	
    	while(st.size() >= 2){
    	    int i = st.pop();
    	    int j = st.pop();
    	    
    	    if(M[i][j] == 1){
    	        st.push(j);     // // i knows j-> i is not celebrity
    	    }
    	    else{
    	        st.push(i);   // // if i does not know j-> j is not celebrity
    	    }
    	}
    	
    	int potentialCelebrity = st.pop();
    	boolean flag = true;
    	for(int i=0; i < n; i++){
    	    if(i != potentialCelebrity){
    	        if(M[i][potentialCelebrity] == 0 || M[potentialCelebrity][i] == 1){
    	            flag = false;
    	            break;
    	        }
    	    }
    	}
    	
    	return flag == false ? -1 : potentialCelebrity;
    }
}