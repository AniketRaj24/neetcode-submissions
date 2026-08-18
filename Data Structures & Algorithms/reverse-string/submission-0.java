class Solution {
    public void reverseString(char[] s) {
       Deque<Character> st = new ArrayDeque<>();
       for(int i = 0; i < s.length; i++){
        st.push(s[i]);
       }
       int index = 0;
       while(!st.isEmpty()){
        char c = st.peek();
        st.pop();
        s[index] = c;
        index++;
       }
    }
}