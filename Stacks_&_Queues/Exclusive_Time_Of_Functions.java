// Input: n = 2, logs = ["0:start:0","1:start:2","1:end:5","0:end:6"]
// Output: [3,4]

class Solution {
    
    class Pair{
        int id;
        int start_time;
        int child_time;
        
        Pair(int id, int start_time, int child_time){
            this.id = id;
            this.start_time = start_time;
            this.child_time = child_time;
        }
    }
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] timeF = new int[n];
        Stack<Pair> st = new Stack<>();
        int len = logs.size();
        
        for(int i = 0; i < len; i++){
            String[] logParts = logs.get(i).split(":");
            if(logParts[1].equals("start")){
                int id = Integer.parseInt(logParts[0]);
                int start_time = Integer.parseInt(logParts[2]);
                Pair p = new Pair(id, start_time, 0);
                st.push(p);
            }
            else{
                Pair p = st.pop();
                int interval = Integer.parseInt(logParts[2]) - p.start_time + 1;
                int time_execution = interval - p.child_time;
                timeF[p.id] += time_execution;
                
                if(st.size() > 0){
                    st.peek().child_time += interval;
                }
            }
        }
        return timeF;
    }
}
