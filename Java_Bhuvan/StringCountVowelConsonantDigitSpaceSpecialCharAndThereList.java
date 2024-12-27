package bhuvan;
import java.util.*;

public class StringCountVowelConsonantDigitSpaceSpecialCharAndThereList {
    public static void main(String[] args) {
        String str = "Hello My name is Bhuvan! My email id is bhuvan822002@gmail.com";
        
        // Create ArrayLists to store characters of different types
        ArrayList<Character> varr = new ArrayList<>(); // Vowels
        ArrayList<Character> sarr = new ArrayList<>(); // Spaces
        ArrayList<Character> narr = new ArrayList<>(); // Numbers
        ArrayList<Character> carr = new ArrayList<>(); // Consonants
        ArrayList<Character> specialarr = new ArrayList<>(); // Special characters
        
        char ch;
        int vcount = 0, ccount = 0, scount = 0, ncount = 0, specialCount = 0;
        
        // Loop through the string
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            // Check for vowels (both uppercase and lowercase)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vcount++;
                varr.add(ch);
            } 
            // Check for spaces
            else if (ch == ' ') {
                scount++;
                sarr.add(ch);
            } 
            // Check for digits
            else if (Character.isDigit(ch)) {
                ncount++;
                narr.add(ch);
            } 
            // Check for consonants (if it's a letter and not a vowel)
            else if (Character.isLetter(ch)) {
                ccount++;
                carr.add(ch);
            } 
            // Otherwise, it's a special character
            else {
                specialCount++;
                specialarr.add(ch);
            }
        }

        // Display the results
        System.out.println("Vowels: " + vcount + " " + varr);
        System.out.println("Consonants: " + ccount + " " + carr);
        System.out.println("Spaces: " + scount + " " + sarr);
        System.out.println("Numbers: " + ncount + " " + narr);
        System.out.println("Special Characters: " + specialCount + " " + specialarr);
    }
}

/*
Expected output:

Vowels: 17 [e, o, a, e, i, u, a, e, a, i, i, i, u, a, a, i, o]
Consonants: 27 [H, l, l, M, y, n, m, s, B, h, v, n, M, y, m, l, d, s, b, h, v, n, g, m, l, c, m]
Spaces: 9 [ ,  ,  ,  ,  ,  ,  ,  ,  ]
Numbers: 6 [8, 2, 2, 0, 0, 2]
Special Characters: 3 [!, @, .]

*/