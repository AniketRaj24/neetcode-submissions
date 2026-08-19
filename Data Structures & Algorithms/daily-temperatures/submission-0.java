class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Deque<Integer> st = new ArrayDeque<>();
        int[] result = new int[n];
        result[n-1] = 0;
        st.push(n-1);
        for(int i = n-2; i >= 0; i--){
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = 0;
            }else{
                result[i] = st.peek() - i;
            }
            st.push(i);
        }
        return result;
    }
}
