package bhuvan;

import java.util.*;

public class ValidParenthesisUsingArrayList {
	public static void main(String[] args) {
		String s = "{(()){}}";
		boolean isValid = true;
		ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '{' || ch == '(' || ch == '[') {
            	list.add(ch);
            } else {
                if (list.isEmpty()) {
                	isValid = false;
                }

                char top = list.remove(list.size()-1);

                if ((ch == '}' && top != '{') ||
                    (ch == ')' && top != '(') ||
                    (ch == ']' && top != '[')) {
                	isValid =  false;
                }
            }
        }
        if(!list.isEmpty()) {
        	isValid = false;
        }
        System.out.println(isValid);
	}
}
