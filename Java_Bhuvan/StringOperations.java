package bhuvan;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
        String str[]= new String[26]; 
        for(int i=0;i<26;i++){
            str[i] = (char)('a'+i)+"";
        }
        System.out.println(Arrays.toString(str));
        
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb);
        
        String sbStr = sb.toString();
        System.out.println(sbStr);
        
        sbStr = sbStr.toUpperCase();
        System.out.println(sbStr);
        System.out.println(sbStr.indexOf('A'));
        
        
        String name="Bhuvan Lalit Bhoge";
        String nameArr[]=name.split(" ");
        System.out.println(Arrays.toString(nameArr));
        
        for(int i=0;i<nameArr.length;i++){
            nameArr[i] = Character.toLowerCase(nameArr[i].charAt(0))+nameArr[i].substring(1); ///makeing first character or work into lower case
            
            nameArr[i] = reverse(nameArr[i]);  ///reversing the each word from array
        }
        System.out.println(Arrays.toString(nameArr));
        System.out.println(reverse(name));
    }
    
    public static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1 = s1 + s.charAt(i);
        }
        return s1;
    }
}
