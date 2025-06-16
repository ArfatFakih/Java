package StackDSA;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                st.push(s.charAt(i));
            }else{
                if(st.isEmpty()){
                    return false;
                }
                else if(s.charAt(i) == ')' && st.peek() != '('){
                    return false;
                }else if(s.charAt(i) == ']' && st.peek() != '['){
                    return false;
                }else if(s.charAt(i) == '}' && st.peek() != '{'){
                    return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "({})[]";
        System.out.println(isValid(s));
    }
}
