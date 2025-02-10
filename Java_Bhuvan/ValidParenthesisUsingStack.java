package bhuvan;

import java.util.*;
public class ValidParenthesisUsingStack {
	public static void main(String[] args) {
		String s = "{((){}}";
		boolean isValid = true;
		Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                	isValid = false;
                }

                char top = stack.pop();

                if ((ch == '}' && top != '{') ||
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[')) {
                	isValid =  false;
                }
            }
        }
        if(!stack.isEmpty()) {
        	isValid = false;
        }
        System.out.println(isValid);
	}
}
