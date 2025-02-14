package bhuvan;

public class StringValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		
		int start = 0;
		int end = s.length()-1;
		boolean isValid = true;
		
		while(start<end) {
			while(start<end && !Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			}
			while(start<end && !Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			}
			if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
				isValid = false;
				break;
			}
			start++;
			end--;
		}
		if(isValid) {
			System.out.println("Given string is Valid");
		}else {
			System.out.println("Given string is NOT valid");
		}
	}

}
