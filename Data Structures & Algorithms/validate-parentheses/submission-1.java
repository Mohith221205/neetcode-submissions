class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        s.toCharArray();
        if(s.length()<=1)
            return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
                st.push(s.charAt(i));
            else{
                if(st.isEmpty())
                    return false;
                else if((st.peek()=='(' && s.charAt(i)==')')||(st.peek()=='{' && s.charAt(i)=='}')||(st.peek()=='[' && s.charAt(i)==']'))
                st.pop();
                else
                    return false;

            }
        }
        return st.isEmpty();
    }
}
