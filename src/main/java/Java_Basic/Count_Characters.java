package Java_Basic;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Count_Characters {

	public static void main(String[] args) {
		                
			String str = "ShaikMohammedSaifulla";
	        TreeMap<Character, Integer> map = new TreeMap<>();

	        for(int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if(map.containsKey(ch)) {              //HashMap: No sorting, just counts.
	                                                   //TreeMap: Counts and sorts the characters alphabetically before printing.
	                int count = map.get(ch);
	                count++;
	                map.put(ch, count);  
	            } else {
	                map.put(ch, 1);  
	            }
	        }

	        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
	            System.out.println(entry.getKey() + " = " + entry.getValue());
	        }
	    

		}
	      //Instead of using a HashMap, this program uses a TreeMap, which automatically sorts the characters alphabetically.
	      //It goes through each letter in the name, just like before:
	      //If the letter is already in the map, it increases the count.
	      //If the letter is not in the map, it adds it with a count of 1.
	      //After counting, it prints each character along with its count in alphabetical order.


	}
         //It uses a HashMap to store each character as a key and the number of times it appears as the value.
         //The program loops through each letter in the name.
         //If the letter is already in the map, it increases the count.
         //If the letter is not in the map, it adds it with a count of 1.
         //Finally, it prints each letter and its count, but without any specific order.


