
package by.htp.string;

public class Stroka {

	public static void main(String[] args) {
        String[] text = {"Hello" , " world"};
        int k = 4; 
        char newChar = 'X'; 
        char[] word;
        for (int i = 0; i < text.length; i++) {
        	
            if (text[i].length() >= k) {
            	
                word = text[i].toCharArray();
                
                word[k-1] = newChar;
                
                text[i] = String.copyValueOf(word);
                
            } }
        
        for (String s : text) {
            System.out.print(s);
            
            
        }}}