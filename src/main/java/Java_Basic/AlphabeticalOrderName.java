package Java_Basic;

import java.util.Arrays;

public class AlphabeticalOrderName {
    public static void main(String[] args) {
    	String name = "saifulla".toLowerCase();
    	
        char[] characters = name.toCharArray();
        
        Arrays.sort(characters);
        
        System.out.println("Characters in alphabetical order:");
        
        for (char ch : characters) {
            System.out.print(ch + " ");
        }
    }
    
    
}
  //The program changes the name "Saifulla" to all small letters (so it's easier to sort). So, "Saifulla" becomes "saifulla".